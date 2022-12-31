package com.example.borrow_book.service;

import com.example.borrow_book.bean.Book;
import com.example.borrow_book.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IService<Book> {
    private IBookRepository repository;
    @Autowired
    public BookService(IBookRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Book> findAll() {
        return repository.findAll();
    }

    @Override
    public Book findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void save(Book book) {
        repository.save(book);
    }

    @Override
    public void delete(Book book) {
        repository.delete(book);
    }
}
