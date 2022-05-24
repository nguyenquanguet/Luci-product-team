package com.example.controller;

import com.example.ser.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class StudentController {
    @Autowired
    private Student.Ser student;

    public void wear() {
        System.out.println("hello");
    }

    @Autowired
    public StudentController(Student.Ser student) {
        this.student = student;
    }



    @GetMapping("/test")
    public String string() {
        return "hello";
    }

    @GetMapping("/all")
    public List<Student> all() {
        return student.getAll();

    }
    @PostMapping("/add")
    public String adds(@RequestBody Student students){
        return student.add(students);
    }
    @PostMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
         return student.delete(id);
    }
    @PutMapping("/update/{id}")
    public String update(@PathVariable Integer id,@RequestBody Student s){
        return student.update(s,id);
    }

}
