package codegym.vn.case_study.service.customer;

import codegym.vn.case_study.entity.customer.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    Customer save(Customer customer);
}
