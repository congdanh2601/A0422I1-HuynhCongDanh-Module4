package codegym.vn.case_study.service.customer;

import codegym.vn.case_study.entity.customer.CustomerType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICustomerTypeService {
    List<CustomerType> findAll();
}
