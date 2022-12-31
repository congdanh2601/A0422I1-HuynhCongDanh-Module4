package com.example.borrow_book.repository;

import com.example.borrow_book.bean.BorrowTicket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITicketRepository extends JpaRepository<BorrowTicket, Integer> {
}
