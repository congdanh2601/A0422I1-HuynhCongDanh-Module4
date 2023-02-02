package codegym.vn.case_study.entity.employee;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @Column(length = 75)
    private String username;
    private String password;
    @OneToMany(mappedBy = "username", fetch = FetchType.LAZY)
    @JsonBackReference
    private List<Employee> employeeList;
    @OneToMany(mappedBy = "username", fetch = FetchType.LAZY)
    @JsonBackReference
    private List<UserRole> userRoleList;

    public User() {
    }

    public User(String username, String password, List<Employee> employeeList, List<UserRole> userRoleList) {
        this.username = username;
        this.password = password;
        this.employeeList = employeeList;
        this.userRoleList = userRoleList;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<UserRole> getUserRoleList() {
        return userRoleList;
    }

    public void setUserRoleList(List<UserRole> userRoleList) {
        this.userRoleList = userRoleList;
    }
}
