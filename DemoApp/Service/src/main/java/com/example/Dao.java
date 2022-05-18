package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Dao extends JpaRepository(User, Integer) {

}