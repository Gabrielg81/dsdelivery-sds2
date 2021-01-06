package com.devsuperior.dsdslivery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsdslivery.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
