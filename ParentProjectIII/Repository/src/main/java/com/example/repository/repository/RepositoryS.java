package com.example.repository.repository;

import com.example.dao.daos.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryS extends JpaRepository<User, Long> {
}
