package com.example.dao;

import com.example.ser.Student;

public class StuMaper {
    public static Dto toEntity(Student model) {
        if (model == null) {
            return null;
        }

        Dto student = new Dto();
        student.setName(model.getName());
        student.setAge(model.getAge());

        return student;
    }
}
