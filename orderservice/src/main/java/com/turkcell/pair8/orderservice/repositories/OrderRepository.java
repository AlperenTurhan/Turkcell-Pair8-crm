package com.turkcell.pair8.orderservice.repositories;

import com.turkcell.pair8.orderservice.entities.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, String>{
}
