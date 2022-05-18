package org.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {

    @Autowired
    private Dao<User> userDao;

    @Autowired
    private User user = new User();

    public void save(User user) {
        userDao.save(this.user);
        this.user = new User();
    }

    public void update(User user){
        userDao.update(this.user);
    }

    public void delete(User user){
        userDao.delete(user);
    }
}