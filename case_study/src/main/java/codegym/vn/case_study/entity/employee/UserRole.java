package codegym.vn.case_study.entity.employee;

import javax.persistence.*;

@Entity
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userRoleId;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "roleId")
    private Role roleId;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "username",referencedColumnName = "username")
    private User username;

    public UserRole() {
    }

    public UserRole(Role roleId, User username) {
        this.roleId = roleId;
        this.username = username;
    }

    public int getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(int userRoleId) {
        this.userRoleId = userRoleId;
    }

    public Role getRoleId() {
        return roleId;
    }

    public void setRoleId(Role roleId) {
        this.roleId = roleId;
    }

    public User getUsername() {
        return username;
    }

    public void setUsername(User username) {
        this.username = username;
    }
}
