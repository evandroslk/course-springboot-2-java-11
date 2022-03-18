package com.educandoweb.course.repositories;

import org.apache.commons.logging.Log;
import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	
}
