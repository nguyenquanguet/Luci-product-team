package org.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class UserDao implements Dao{

    @Autowired
    private UserDaos userDaos;


    public User save(User a){
        User save = userDaos.save(a);
        return save;
    }

}
