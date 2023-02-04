package codegym.vn.case_study.repository.customer;

import codegym.vn.case_study.entity.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICustomerRepository extends JpaRepository<Customer, String> {
    List<Customer> findByCustomerNameContains(String name);
}