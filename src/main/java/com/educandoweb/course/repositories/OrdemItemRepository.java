package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.entities.OrderItem;

@Repository
public interface OrdemItemRepository extends JpaRepository<OrderItem, Long> {

	
	
}
