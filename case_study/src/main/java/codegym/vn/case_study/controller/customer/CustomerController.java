package codegym.vn.case_study.controller.customer;

import codegym.vn.case_study.entity.customer.Customer;
import codegym.vn.case_study.service.customer.CustomerService;
import codegym.vn.case_study.service.customer.ICustomerService;
import codegym.vn.case_study.service.customer.ICustomerTypeService;
import codegym.vn.case_study.validation.CustomerValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping({"/customer", ""})
public class CustomerController {
    private ICustomerService customerService;
    private ICustomerTypeService customerTypeService;

    @Autowired
    public CustomerController(ICustomerService customerService, ICustomerTypeService customerTypeService) {
        this.customerService = customerService;
        this.customerTypeService = customerTypeService;
    }

    @GetMapping("")
    public String findAll(Model model, @RequestParam("page") Optional<Integer> page,
                          @RequestParam("size") Optional<Integer> size,
                          @RequestParam("sort") Optional<String> sort,
                          @RequestParam(defaultValue = "") List<Customer> list,
                          @RequestParam(defaultValue = "") String search) {
        int currentPage = page.orElse(1);
        int pageSize = size.orElse(3);
        String sortField = sort.orElse("customerType");
        Page<Customer> customerList = customerService.findAllWithPaging(PageRequest.of(currentPage - 1, pageSize, Sort.by(sortField).ascending()));
        model.addAttribute("currentPage", currentPage - 1);
        int totalPages = customerList.getTotalPages();
        if (totalPages > 1) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
                    .boxed()
                    .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }
        if (list.isEmpty()) {
            model.addAttribute("list", customerList);
            model.addAttribute("totalPages", totalPages);
            model.addAttribute("totalElements", customerList.getTotalElements());
            model.addAttribute("number", customerList.toList().size());
        } else {
            model.addAttribute("totalPages", 0);
            model.addAttribute("list", list);
            model.addAttribute("totalElements", list.size());
            model.addAttribute("number", list.size());
            model.addAttribute("number", list.size());
            model.addAttribute("search", search);
        }
        return "customer";
    }

    @GetMapping("add")
    public String showAddForm(Model model) {
        model.addAttribute("customer", new Customer());
        model.addAttribute("types", customerTypeService.findAll());
        return "addCustomer";
    }

    @PostMapping("update")
    public String save(Model model, @Valid @ModelAttribute Customer customer, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        CustomerValidator validator = new CustomerValidator();
        validator.validate(customer, bindingResult);
        if (bindingResult.hasErrors()) {
            model.addAttribute("types", customerTypeService.findAll());
            return "addCustomer";
        }
        if (customerService.findById(customer.getCustomerId()) != null) {
            redirectAttributes.addFlashAttribute("mess", "Customer edited.");
        } else redirectAttributes.addFlashAttribute("mess", "Customer added.");
        customerService.save(customer);
        return "redirect:/customer";
    }

    @GetMapping("edit")
    public String showFormEdit(Model model, @RequestParam String id) {
        Customer customer = customerService.findById(id);
        model.addAttribute("customer", customer);
        model.addAttribute("types", customerTypeService.findAll());
        return "addCustomer";
    }

    @GetMapping("search")
    public String searchByName(RedirectAttributes redirectAttributes, @RequestParam(name = "name") String name) {
        redirectAttributes.addAttribute("list", customerService.findByName(name));
        redirectAttributes.addAttribute("search", name);
        return "redirect:/customer";
    }

    @GetMapping("delete")
    public String delete(RedirectAttributes redirectAttributes, @RequestParam String id) {
        customerService.delete(id);
        redirectAttributes.addFlashAttribute("mess", "Customer deleted");
        return "redirect:/customer";
    }
}
