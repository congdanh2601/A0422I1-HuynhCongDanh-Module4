package codegym.vn.case_study.repository.customer;

import codegym.vn.case_study.entity.customer.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerTypeRepository extends JpaRepository<CustomerType, Integer> {

}
