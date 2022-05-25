package org.example.service;


public class EmployeeDTO {

    private  Long id;
    private String name;
    private int mobile;
    private int age;
    private String email;

    public EmployeeDTO() {
    }

    public EmployeeDTO(Long id, String name, int mobile, int age, String email) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.age = age;
        this.email = email;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
