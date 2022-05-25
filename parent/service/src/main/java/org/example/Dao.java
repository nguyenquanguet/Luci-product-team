package org.example;

import org.example.service.Service;
import java.util.List;

public interface Dao {
    List<Service.ServiceDTO> listAllUser();
    boolean save(Service.ServiceDTO serviceDTO);
    boolean update(Service.ServiceDTO serviceDTO, int id);
    boolean delete(int id);

}
