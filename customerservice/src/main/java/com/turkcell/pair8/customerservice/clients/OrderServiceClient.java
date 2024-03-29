package com.turkcell.pair8.customerservice.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="orderservice")
public interface OrderServiceClient
{
    @GetMapping("/api/orders")
    int getCustomerIdByOrderId(@RequestParam("orderId") String orderId);
}
