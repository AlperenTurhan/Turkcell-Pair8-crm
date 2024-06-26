package com.turkcell.pair8.invoiceservice;

import com.turkcell.pair8.events.OrderCreatedEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class InvoiceserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvoiceserviceApplication.class, args);
	}

	@KafkaListener(topics = "orderTopic", groupId = "invoiceGroup")
	public void handleEvent(OrderCreatedEvent event){
		System.out.println("Kafka message received: ");
	}
}
