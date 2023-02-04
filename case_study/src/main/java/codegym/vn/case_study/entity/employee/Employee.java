package codegym.vn.case_study.entity.employee;

import codegym.vn.case_study.entity.contract.Contract;
import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import java.util.Date;
import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;
    private String employeeName;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date employeeBirthday;
    @Pattern(regexp = "^([0-9]{9}){1}([0-9]{3})?", message = "{idCard.format}")
    private String employeeIdCard;
    @Min(value = 1, message = "{salary.min}")
    private double employeeSalary;
    @Pattern(regexp = "^[0|(+84)]{1}9[0|1]{1}[0-9]{7}", message = "{phone.format}")
    private String employeePhone;
    @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "{email.format}")
    private String employeeEmail;
    private String employeeAddress;
    @ManyToOne
    @JoinColumn(referencedColumnName = "positionId")
    private Position positionId;
    @ManyToOne
    @JoinColumn(referencedColumnName = "educationDegreeId")
    private EducationDegree educationDegreeId;
    @ManyToOne
    @JoinColumn(referencedColumnName = "divisionId")
    private Division divisionId;
    @ManyToOne
    @JoinColumn(referencedColumnName = "username")
    private User username;
    @OneToMany(mappedBy = "employeeId", fetch = FetchType.LAZY)
    @JsonBackReference
    private List<Contract> contractList;

    public Employee() {
    }

    public Employee(String employeeName, Date employeeBirthday, String employeeIdCard, double employeeSalary, String employeePhone, String employeeEmail, String employeeAddress, Position positionId, EducationDegree educationDegreeId, Division divisionId, User username, List<Contract> contractList) {
        this.employeeName = employeeName;
        this.employeeBirthday = employeeBirthday;
        this.employeeIdCard = employeeIdCard;
        this.employeeSalary = employeeSalary;
        this.employeePhone = employeePhone;
        this.employeeEmail = employeeEmail;
        this.employeeAddress = employeeAddress;
        this.positionId = positionId;
        this.educationDegreeId = educationDegreeId;
        this.divisionId = divisionId;
        this.username = username;
        this.contractList = contractList;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Date getEmployeeBirthday() {
        return employeeBirthday;
    }

    public void setEmployeeBirthday(Date employeeBirthday) {
        this.employeeBirthday = employeeBirthday;
    }

    public String getEmployeeIdCard() {
        return employeeIdCard;
    }

    public void setEmployeeIdCard(String employeeIdCard) {
        this.employeeIdCard = employeeIdCard;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public Position getPositionId() {
        return positionId;
    }

    public void setPositionId(Position positionId) {
        this.positionId = positionId;
    }

    public EducationDegree getEducationDegreeId() {
        return educationDegreeId;
    }

    public void setEducationDegreeId(EducationDegree educationDegreeId) {
        this.educationDegreeId = educationDegreeId;
    }

    public Division getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Division divisionId) {
        this.divisionId = divisionId;
    }

    public User getUsername() {
        return username;
    }

    public void setUsername(User username) {
        this.username = username;
    }

    public List<Contract> getContractList() {
        return contractList;
    }

    public void setContractList(List<Contract> contractList) {
        this.contractList = contractList;
    }
}
