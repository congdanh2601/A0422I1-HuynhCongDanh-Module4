package com.example.borrow_book.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());
    private int countLog = 0;

    @AfterReturning("execution(* com.example.borrow_book.service.TicketService.delete(..))")
    public void getLogReturnBook() {
        logger.info("After: Return book success");
    }

    @AfterReturning("execution(* com.example.borrow_book.service.TicketService.save(..))")
    public void getLogBorrow() {
        logger.info("After: Borrow success");
    }

    @Before("execution(* com.example.borrow_book.controller.BookController.*(..))")
    public void getLog() {
        countLog++;
        logger.info("Views: " + countLog);
    }
}
