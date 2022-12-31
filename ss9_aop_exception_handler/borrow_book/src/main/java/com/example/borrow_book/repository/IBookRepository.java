package com.example.borrow_book.repository;

import com.example.borrow_book.bean.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book, Integer> {
}
