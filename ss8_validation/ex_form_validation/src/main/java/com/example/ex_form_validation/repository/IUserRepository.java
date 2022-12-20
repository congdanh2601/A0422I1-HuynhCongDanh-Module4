package com.example.ex_form_validation.repository;

import com.example.ex_form_validation.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Integer> {

}
