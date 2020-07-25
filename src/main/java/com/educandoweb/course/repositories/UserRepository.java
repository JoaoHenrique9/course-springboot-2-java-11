package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;

//@Repository não está sendo obrigadoria pelo fato da classe está extendendo JpaRepository. 
public interface UserRepository extends JpaRepository<User, Long>{
	
}
