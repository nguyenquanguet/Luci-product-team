package com.example.dao.dao;

import com.example.ser.Student;
import com.example.dao.repo.StuRepostory;
import com.example.dao.model.StuModel;
import com.example.ser.ser.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StuDao implements Services {
    @Autowired
    private StuRepostory stuRepostory;

    @Autowired
    public StuDao(StuRepostory stuRepostory) {
        this.stuRepostory = stuRepostory;
    }

    @Override
    public String save(Student student) {
        stuRepostory.save(todo(student));
        return "InsertSuccess";
    }

    @Override
    public List<Student> litAll() {
        List<Student> list = new ArrayList<Student>();
        for (StuModel stuModel : stuRepostory.findAll()) {
            list.add(to(stuModel));
        }
        return list;
    }

    @Override
    public String delete(Integer id) {
        stuRepostory.deleteById(id);
        return "DeleteSuccess";
    }

    @Override
    public String update(Student student,Integer id) {
        StuModel stuModel=stuRepostory.findById(id).get();
        stuModel.setName(student.getName());
        stuModel.setAge(student.getAge());
         stuRepostory.save(stuModel);
         return "UpdateSuccess";
    }


    public static Student to(StuModel stuModel) {
        if (stuModel == null) {
            return null;
        }
        Student student = new Student();
        student.setId(stuModel.getId());
        student.setName(stuModel.getName());
        student.setAge(stuModel.getAge());
        return student;
    }

    public static StuModel todo(Student student) {
        if (student == null) {
            return null;
        }
        StuModel stuModel = new StuModel();
        stuModel.setAge(student.getAge());
        stuModel.setName(student.getName());
        return stuModel;
    }
}
