package com.nimsoc.ms.orderservice.repository;

import com.nimsoc.ms.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
