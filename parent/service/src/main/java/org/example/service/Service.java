package org.example.service;

import org.example.Dao;

import java.util.List;

public class Service {
    //    ServiceDTO
    public static class ServiceDTO{
        private int id;
        private String name;
        private int age;
        private String email;


        public ServiceDTO() {

        }

        public ServiceDTO(int id, String name, int age, String email) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.email = email;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
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

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }

    public Service(){

    }
    private Dao dao;

    public Service(Dao dao) {
        this.dao = dao;
    }

    public List<ServiceDTO> getAllUser(){
        return dao.listAllUser();
    }

    public boolean update(ServiceDTO serviceDTO, int id){
        return dao.update(serviceDTO, id);
    }

    public boolean save(ServiceDTO serviceDTO){
        if (serviceDTO == null)
            return false;
        dao.save(serviceDTO);
        return true;
    }

    public boolean delete(int id){
        if(id == 0){
            return false;
        }
        return dao.delete(id);
    }
}