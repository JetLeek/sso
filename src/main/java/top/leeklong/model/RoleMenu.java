package top.leeklong.model;/**
 * Created by pc on 2017/8/14.
 */

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * 角色功能中间表
 *
 * @author lee
 * @create 2017-08-14 16:59
 **/
public class RoleMenu {
    private static final long serialVersionUID = 1L;
    @Id
    @GenericGenerator(name = "id", strategy = "native")
    @GeneratedValue(generator = "id")
    @Column(name="id", length = 32)
    private Long id;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="role_id", columnDefinition = "char(32) COMMENT '角色id'")
    private Role role;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="menu_id", columnDefinition = "char(32) COMMENT '菜单id'")
    private Menu menu;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
