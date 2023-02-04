package codegym.vn.case_study.service.customer;

import codegym.vn.case_study.entity.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    void save(Customer customer);
    Customer findById(String id);
    Page<Customer> findAllWithPaging(Pageable pageable);
    List<Customer> findByName(String name);
    void delete(String id);
}
