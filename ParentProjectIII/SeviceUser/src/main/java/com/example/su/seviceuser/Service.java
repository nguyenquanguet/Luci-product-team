package com.example.su.seviceuser;

import com.example.dao.daos.User;
import com.example.repository.repository.RepositoryS;

import java.util.List;
@org.springframework.stereotype.Service
public class Service implements IService {

    private RepositoryS repositoryS;

    @Override
    public List<User> getAll() {
        return repositoryS.findAll();
    }
}
