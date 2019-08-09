package com.springjpaoracledemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springjpaoracledemo.dao.Dao;
import com.springjpaoracledemo.entity.User;

@Service
public class UService {
    
	@Autowired
    Dao userDao;

    public List<User> getAllUsers() {
        return this.userDao.findAll();
    }

    public User addUser(User user) {
        return this.userDao.save(user);
    }

    //other methods omitted for brevity
    
    public Optional<User> getUserById(int id) {
        return this.userDao.findById(id);
    }

    public User updateUser(User user) {
        return this.userDao.save(user);
    }

    public void deleteUserById(int id) {
        this.userDao.deleteById(id);
    }

    public void deleteAllUsers() {
        this.userDao.deleteAll();
    }
}
