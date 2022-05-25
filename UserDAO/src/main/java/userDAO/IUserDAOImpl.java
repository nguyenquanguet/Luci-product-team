package userDAO;

import UserService.IUserDAO;
import UserService.ServiceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import userDAO.h.UserRepository;
import userDAO.h.UserDAO;

import java.util.ArrayList;
import java.util.List;

@Component
public class IUserDAOImpl implements IUserDAO {

    private UserRepository userRepository;

    @Autowired
    public IUserDAOImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<ServiceDTO> getAll() {
        List<ServiceDTO> serviceDTO = new ArrayList<ServiceDTO>();
        for (UserDAO userDAO : userRepository.findAll()) {
            serviceDTO.add(converstDAOToDTO(userDAO));
        }
        return serviceDTO;
    }

    @Override
    public ServiceDTO create(ServiceDTO serviceDTO) {
        UserDAO userDAO = userRepository.save(converstDTOToDAO(serviceDTO));
        ServiceDTO sDTO = converstDAOToDTO(userDAO);
        return sDTO;
    }

    @Override
    public ServiceDTO update(Long id, ServiceDTO serviceDTO) {
        if (serviceDTO != null) {
            UserDAO userDAO = userRepository.getById(id);
            if (userDAO != null) {
                userDAO.setName(serviceDTO.getName());
                UserDAO uDAO = userRepository.save(converstDTOToDAO(serviceDTO));
                ServiceDTO sDTO = converstDAOToDTO(uDAO);
                return sDTO;
            }

        }
        return null;
    }

    @Override
    public boolean deleteUser(Long id) {
        UserDAO userDAO = userRepository.getById(id);
        userRepository.delete(converstDTOToDAO(converstDAOToDTO(userDAO)));
        return false;
    }


    public static ServiceDTO converstDAOToDTO(UserDAO userDAO) {
        if (userDAO == null) {
            return null;
        }
        ServiceDTO serviceDTO = new ServiceDTO();
        serviceDTO.setId(userDAO.getId());
        serviceDTO.setName(userDAO.getName());
        return serviceDTO;
    }

    public static UserDAO converstDTOToDAO(ServiceDTO serviceDTO) {
        UserDAO userDAO = new UserDAO();
        userDAO.setId(serviceDTO.getId());
        userDAO.setName(serviceDTO.getName());
        return userDAO;
    }

}
