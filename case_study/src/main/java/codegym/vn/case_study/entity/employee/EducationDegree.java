package codegym.vn.case_study.entity.employee;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class EducationDegree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int educationDegreeId;
    private String educationDegreeName;
    @OneToMany(mappedBy = "educationDegreeId", fetch = FetchType.LAZY)
    @JsonBackReference
    private List<Employee> employeeList;

    public EducationDegree() {
    }

    public EducationDegree(String educationDegreeName, List<Employee> employeeList) {
        this.educationDegreeName = educationDegreeName;
        this.employeeList = employeeList;
    }

    public int getEducationDegreeId() {
        return educationDegreeId;
    }

    public void setEducationDegreeId(int educationDegreeId) {
        this.educationDegreeId = educationDegreeId;
    }

    public String getEducationDegreeName() {
        return educationDegreeName;
    }

    public void setEducationDegreeName(String educationDegreeName) {
        this.educationDegreeName = educationDegreeName;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
