package org.example.dao;

import org.example.Dao;
import org.example.entity.Entity;
import org.example.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.*;

@Component
public class DaoImp implements Dao {

    private final UserRepository userRepository;

    @Autowired
    public DaoImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    /**
    public void checkDB(){
        if (userRepository != null) {
            System.out.println("Connection!");
        }
        System.out.println("Failed Connection!");
    }
    */

    @Override
    public List<Service.ServiceDTO> listAllUser() {
        List<Service.ServiceDTO> serviceDTO = new ArrayList<>();
        for (Entity entity : userRepository.findAll()) {
            serviceDTO.add(toServiceEntity(entity));
        }
        return serviceDTO;
    }

    @Override
    public boolean save(Service.ServiceDTO serviceDTO) {
        userRepository.save(toEntity((serviceDTO)));
        return true;
    }

    @Override
    public boolean update(Service.ServiceDTO serviceDTO, int id) {
        if(!userRepository.existsById(id)) {
            return false;
        }
        userRepository.save(toEntity(serviceDTO));
        return true;
    }

    @Override
    public boolean delete(int id) {
        if(!userRepository.existsById(id))
            return false;
        userRepository.deleteById(id);
        return true;
    }

//    Chuyen doi serviceDTO sang Entity
    public static Service.ServiceDTO toServiceEntity(Entity entity){
        if (entity == null) {
            return null;
        }
        Service.ServiceDTO serviceEntity = new Service.ServiceDTO();
        serviceEntity.setId(entity.getId());
        serviceEntity.setAge(entity.getAge());
        serviceEntity.setName(entity.getName());
        serviceEntity.setEmail(entity.getEmail());
        return serviceEntity;
    }

//    Chuyen doi tu Entity sang serviceDTO
    public static Entity toEntity(Service.ServiceDTO serviceDTO){
        if(serviceDTO == null){
            return null;
        }
        Entity entity = new Entity();
        entity.setAge(serviceDTO.getAge());
        entity.setId(serviceDTO.getId());
        entity.setName(serviceDTO.getName());
        entity.setEmail(serviceDTO.getEmail());
        return entity;
    }

}
