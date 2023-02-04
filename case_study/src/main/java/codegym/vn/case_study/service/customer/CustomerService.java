package codegym.vn.case_study.service.customer;

import codegym.vn.case_study.entity.customer.Customer;
import codegym.vn.case_study.repository.customer.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    private ICustomerRepository customerRepository;
    @Autowired
    public CustomerService(ICustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Customer findById(String id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Customer> findAllWithPaging(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public List<Customer> findByName(String name) {
        return customerRepository.findByCustomerNameContains(name);
    }

    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);
    }
}
