package codegym.vn.case_study.entity.employee;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int divisionId;
    private String divisionName;
    @OneToMany(mappedBy = "divisionId", fetch = FetchType.LAZY)
    @JsonBackReference
    private List<Employee> employeeList;

    public Division() {
    }

    public Division(String divisionName, List<Employee> employeeList) {
        this.divisionName = divisionName;
        this.employeeList = employeeList;
    }

    public int getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(int divisionId) {
        this.divisionId = divisionId;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
