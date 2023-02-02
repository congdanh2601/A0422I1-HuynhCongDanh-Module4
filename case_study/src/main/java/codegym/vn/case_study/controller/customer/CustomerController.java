package codegym.vn.case_study.controller.customer;

import codegym.vn.case_study.entity.customer.Customer;
import codegym.vn.case_study.service.customer.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    private ICustomerService customerService;
    @Autowired
    public CustomerController(ICustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("")
    public String findAll(Model model) {
        List<Customer> customerList = customerService.findAll();
        model.addAttribute("list", customerList);
        return "customer";
    }

    @GetMapping("add")
    public String showAddForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "addCustomer";
    }
}
