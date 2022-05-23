package org.example.dao;

import org.example.Dao;
import org.example.Entity;
import org.example.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.*;
@Component
public class DaoImp implements Dao {

    private UserRepository userRepository;

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

}
