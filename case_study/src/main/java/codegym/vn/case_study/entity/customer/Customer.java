package codegym.vn.case_study.entity.customer;

import codegym.vn.case_study.entity.contract.Contract;
import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.util.Date;
import java.util.List;

@Entity
public class Customer {
    @Id
    @Column(length = 7)
    @Pattern(regexp = "^KH-[0-9]{4}$", message = "{customerId.format}")
    private String customerId;
    @ManyToOne
    @JoinColumn(referencedColumnName = "customerTypeId")
    private CustomerType customerType;
    private String customerName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date customerBirthday;
    private boolean customerGender;
    @Pattern(regexp = "^([0-9]{9}){1}([0-9]{3})?", message = "{idCard.format}")
    private String customerIdCard;
    @Pattern(regexp = "^(0|\\(\\+84\\))9[01][0-9]{7}$", message = "{phone.format}")
    private String customerPhone;
    @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "{email.format}")
    private String customerEmail;
    private String customerAddress;
    @OneToMany(mappedBy = "contractId", fetch = FetchType.LAZY)
    @JsonBackReference
    private List<Contract> contractList;

    public Customer() {
    }

    public Customer(String customerId, CustomerType customerType, String customerName, Date customerBirthday, boolean customerGender, String customerIdCard, String customerPhone, String customerEmail, String customerAddress, List<Contract> contractList) {
        this.customerId = customerId;
        this.customerType = customerType;
        this.customerName = customerName;
        this.customerBirthday = customerBirthday;
        this.customerGender = customerGender;
        this.customerIdCard = customerIdCard;
        this.customerPhone = customerPhone;
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
        this.contractList = contractList;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getCustomerBirthday() {
        return customerBirthday;
    }

    public void setCustomerBirthday(Date customerBirthday) {
        this.customerBirthday = customerBirthday;
    }

    public boolean isCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(boolean customerGender) {
        this.customerGender = customerGender;
    }

    public String getCustomerIdCard() {
        return customerIdCard;
    }

    public void setCustomerIdCard(String customerIdCard) {
        this.customerIdCard = customerIdCard;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public List<Contract> getContractList() {
        return contractList;
    }

    public void setContractList(List<Contract> contractList) {
        this.contractList = contractList;
    }
}
