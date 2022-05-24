package com.example.ser.ser;

import com.example.ser.Student;

import java.util.List;

public interface Services {
   String save(Student student);
   List<Student> litAll();
   String delete(Integer id);
   String update(Student student,Integer id);
}
