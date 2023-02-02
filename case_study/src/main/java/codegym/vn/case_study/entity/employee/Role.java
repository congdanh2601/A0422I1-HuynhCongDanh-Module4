package codegym.vn.case_study.entity.employee;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roleId;
    private String roleName;
    @OneToMany(mappedBy = "roleId", fetch = FetchType.LAZY)
    @JsonBackReference
    private List<UserRole> userRoleList;

    public Role() {
    }

    public Role(String roleName, List<UserRole> userRoleList) {
        this.roleName = roleName;
        this.userRoleList = userRoleList;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<UserRole> getUserRoleList() {
        return userRoleList;
    }

    public void setUserRoleList(List<UserRole> userRoleList) {
        this.userRoleList = userRoleList;
    }
}
