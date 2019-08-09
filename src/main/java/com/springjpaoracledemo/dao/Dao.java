package com.springjpaoracledemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springjpaoracledemo.entity.User;

@Repository
public interface Dao extends JpaRepository<User, Integer>{
	

}

