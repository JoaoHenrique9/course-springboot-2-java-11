package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Order;

//@Repository não está sendo obrigadoria pelo fato da classe está extendendo JpaRepository. 
public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
