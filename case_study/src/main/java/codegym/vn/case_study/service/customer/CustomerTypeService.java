package codegym.vn.case_study.service.customer;

import codegym.vn.case_study.entity.customer.CustomerType;
import codegym.vn.case_study.repository.customer.ICustomerTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeService implements ICustomerTypeService {
    private ICustomerTypeRepository customerTypeRepository;

    @Autowired
    public CustomerTypeService(ICustomerTypeRepository customerTypeRepository) {
        this.customerTypeRepository = customerTypeRepository;
    }

    @Override
    public List<CustomerType> findAll() {
        return customerTypeRepository.findAll();
    }

}
