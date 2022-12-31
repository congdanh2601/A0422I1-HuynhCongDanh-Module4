package com.example.borrow_book.service;

import com.example.borrow_book.bean.Book;
import com.example.borrow_book.bean.BorrowTicket;

import java.util.List;

public interface IService<E> {
    List<E> findAll();
    E findById(int id);
    void save(E e);
    void delete(E e);
}
