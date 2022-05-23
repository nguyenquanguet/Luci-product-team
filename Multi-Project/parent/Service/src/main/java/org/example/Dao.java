package org.example;

import org.example.service.Service;
import java.util.List;

public interface Dao {
    List<Service.ServiceDTO> listAllUser();
    void save(Service.ServiceDTO serviceDTO);
    void update(Service.ServiceDTO serviceDTO, int id);
    void delete(int id);

}
