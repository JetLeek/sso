package top.leeklong.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 角色表
 *
 * Created by chenglong on 2017/6/16.
 */
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GenericGenerator(name = "id", strategy = "native")
    @GeneratedValue(generator = "id")
    @Column(name="id", length = 32)
    private Long id;

    @Column(name = "role_name",length = 64)
    private String roleName;//角色名称

    @Column(name = "role_desc",length = 256)
    private String roleDesc;

    @Column(name = "role_project",length = 64)
    private String roleProject;

    @Column(name = "role_type")
    private Integer roleType;

    @Column(name = "role_status")
    private Integer roleStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public String getRoleProject() {
        return roleProject;
    }

    public void setRoleProject(String roleProject) {
        this.roleProject = roleProject;
    }

    public Integer getRoleType() {
        return roleType;
    }

    public void setRoleType(Integer roleType) {
        this.roleType = roleType;
    }

    public Integer getRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(Integer roleStatus) {
        this.roleStatus = roleStatus;
    }
}
