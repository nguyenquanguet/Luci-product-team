package com.example.ser;

public class StuCase {
    private Services services;
    public void FindStudentByNameUseCase(Services services){
        this.services=services;
    }
    public Student find(String name){
        return services.findByName(name);
    }
}
