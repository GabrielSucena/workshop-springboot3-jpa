package com.gabrielsucena.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielsucena.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
