package UserService;

import java.util.List;

public interface IUserDAO {
    List<ServiceDTO> getAll();

    ServiceDTO create(ServiceDTO serviceDTO);

    ServiceDTO update(Long id, ServiceDTO serviceDTO);

    boolean deleteUser(Long id);
}
