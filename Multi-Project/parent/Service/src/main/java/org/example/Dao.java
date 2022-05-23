package org.example;

import org.example.service.Service;
import java.util.List;

public interface Dao {
    List<Service.ServiceDTO> listAllUser();
}
