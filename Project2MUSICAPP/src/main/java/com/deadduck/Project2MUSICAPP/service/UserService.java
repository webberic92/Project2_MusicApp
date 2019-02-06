package com.deadduck.Project2MUSICAPP.service;

import com.deadduck.Project2MUSICAPP.bean.User;
import com.deadduck.Project2MUSICAPP.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository repository;

    @Override
    public List<User> findAll() {

        List<User> users = (List<User>) repository.findAll();
        
        return users;
    }
}