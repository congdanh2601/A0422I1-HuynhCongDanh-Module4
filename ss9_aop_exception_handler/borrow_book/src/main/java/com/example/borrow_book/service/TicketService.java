package com.example.borrow_book.service;

import com.example.borrow_book.bean.Book;
import com.example.borrow_book.bean.BorrowTicket;
import com.example.borrow_book.repository.ITicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService implements IService<BorrowTicket> {
    private ITicketRepository repository;
    @Autowired
    public TicketService(ITicketRepository repository) {
        this.repository = repository;
    }
    @Override
    public List<BorrowTicket> findAll() {
        return repository.findAll();
    }

    @Override
    public BorrowTicket findById(int borrowCode) {
        return repository.findById(borrowCode).orElse(null);
    }

    @Override
    public void save(BorrowTicket borrowTicket) {
        repository.save(borrowTicket);
    }

    @Override
    public void delete(BorrowTicket borrowTicket) {
        repository.delete(borrowTicket);
    }
}
