package codegym.vn.case_study.entity.contract;

import codegym.vn.case_study.entity.customer.Customer;
import codegym.vn.case_study.entity.employee.Employee;
import codegym.vn.case_study.entity.service.Service;
import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.util.Date;
import java.util.List;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int contractId;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date contractStartDate;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date contractEndDate;
    @Min(value = 1, message = "{deposit.min}")
    private double contractDeposit;
    @Min(value = 1, message = "{totalMoney.min}")
    private double contractTotalMoney;
    @ManyToOne
    @JoinColumn(referencedColumnName = "employeeId")
    private Employee employeeId;
    @ManyToOne
    @JoinColumn(referencedColumnName = "customerId")
    private Customer customerId;
    @ManyToOne
    @JoinColumn(referencedColumnName = "serviceId")
    private Service serviceId;
    @OneToMany(mappedBy = "contractDetailId", fetch = FetchType.LAZY)
    @JsonBackReference
    private List<ContractDetail> contractDetailList;

    public Contract() {
    }

    public Contract(Date contractStartDate, Date contractEndDate, double contractDeposit, double contractTotalMoney, Employee employeeId, Customer customerId, Service serviceId, List<ContractDetail> contractDetailList) {
        this.contractStartDate = contractStartDate;
        this.contractEndDate = contractEndDate;
        this.contractDeposit = contractDeposit;
        this.contractTotalMoney = contractTotalMoney;
        this.employeeId = employeeId;
        this.customerId = customerId;
        this.serviceId = serviceId;
        this.contractDetailList = contractDetailList;
    }

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    public Date getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(Date contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public Date getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(Date contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public double getContractDeposit() {
        return contractDeposit;
    }

    public void setContractDeposit(double contractDeposit) {
        this.contractDeposit = contractDeposit;
    }

    public double getContractTotalMoney() {
        return contractTotalMoney;
    }

    public void setContractTotalMoney(double contractTotalMoney) {
        this.contractTotalMoney = contractTotalMoney;
    }

    public Employee getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Employee employeeId) {
        this.employeeId = employeeId;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public Service getServiceId() {
        return serviceId;
    }

    public void setServiceId(Service serviceId) {
        this.serviceId = serviceId;
    }

    public List<ContractDetail> getContractDetailList() {
        return contractDetailList;
    }

    public void setContractDetailList(List<ContractDetail> contractDetailList) {
        this.contractDetailList = contractDetailList;
    }
}
