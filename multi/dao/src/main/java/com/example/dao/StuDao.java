package com.example.dao;

import com.example.ser.Services;
import com.example.ser.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StuDao implements Services {
    private StuRepostory stuRepostory;

    @Override
    public Student findByName(String name) {
        StuModel findByName=stuRepostory.findByName(name);
        return StuMaper.toEntity(findByName);
    }
}
