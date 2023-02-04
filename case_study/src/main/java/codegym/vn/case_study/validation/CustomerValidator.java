package codegym.vn.case_study.validation;

import codegym.vn.case_study.entity.customer.Customer;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class CustomerValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        if(!(target instanceof Customer)) return;
        Customer customer = (Customer) target;
        if(!customer.getCustomerPhone().matches("^0[0-9]{9}$")) {
            errors.rejectValue("phone", "phone.format", "Số điện thoại không đúng định dạng");
        }
    }
}
