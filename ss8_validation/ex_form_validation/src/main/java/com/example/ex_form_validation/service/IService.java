package com.example.ex_form_validation.service;

import com.example.ex_form_validation.bean.User;

import java.util.List;

public interface IService<E> {
    List<E> findAll();
    void save(E e);
    void deleteById(int id);
    void findById(int id);
}
