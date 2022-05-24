package com.example.ser;

import com.example.ser.ser.Services;

import java.util.List;

public class Student {
    private String name;
    private int age;
    private int id;

    public Student() {
    }
    public Student(String name,int age,int id) {
        this.name=name;
        this.age=age;
        this.id=id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


   public  static class Ser{
       private Services services;
       public Ser(){

       }
       public Ser(Services services){
           this.services=services;
       }
       public List<Student> getAll(){
           return services.litAll();
       }
       public  String add(Student student){
           return services.save(student);
       }
       public String delete(Integer id){
            return services.delete(id);
       }
       public String update(Student student,Integer id){
           return services.update(student,id);
       }
   }

}
