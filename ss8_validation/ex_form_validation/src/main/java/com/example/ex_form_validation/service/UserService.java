package com.example.ex_form_validation.service;

import com.example.ex_form_validation.bean.User;
import com.example.ex_form_validation.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IService<User> {
    private IUserRepository repository;
    @Autowired
    public UserService(IUserRepository repository) {
        this.repository = repository;
    }
    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public void save(User user) {
        repository.save(user);
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }

    @Override
    public void findById(int id) {
        repository.findById(id);
    }
}
