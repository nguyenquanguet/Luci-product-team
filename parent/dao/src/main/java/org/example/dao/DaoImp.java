package org.example.dao;

import org.example.Dao;
import org.example.entity.Entity;
import org.example.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.*;

@Component
public class DaoImp implements Dao {

    private UserRepository userRepository;
    private List<Entity> userEntity = new ArrayList<Entity>();

    //Config
    @Autowired
    public DaoImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
        public List<Service.ServiceDTO> listAllUser() {
            List<Service.ServiceDTO> serviceDTO = new ArrayList<Service.ServiceDTO>();
            for (Entity entity : userRepository.findAll()) {
                serviceDTO.add(toServiceEntity(entity));
            }
            return serviceDTO;
        }

    @Override
    public void save(Service.ServiceDTO serviceDTO) {
        userRepository.save(toEntity((serviceDTO)));
    }

    @Override
    public void update(Service.ServiceDTO serviceDTO, int id) {
        if(userRepository.findById(id).toString() == null);
            System.out.println("Null");
        userRepository.save(toEntity(serviceDTO));
    }

    @Override
    public void delete(int id) {
        if(userRepository.findById(id).toString() == null);
            System.out.println("Null");
        userRepository.deleteById(id);
    }

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
