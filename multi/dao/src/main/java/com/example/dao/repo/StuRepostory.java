package com.example.dao.repo;

import com.example.dao.model.StuModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StuRepostory extends JpaRepository<StuModel, Integer> {
    StuModel findByName(String name);
}
