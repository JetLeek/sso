package top.leeklong.model;/**
 * Created by pc on 2017/8/14.
 */

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * 用户角色中间表
 *
 * @author lee
 * @create 2017-08-14 16:58
 **/
public class UserRole {
    private static final long serialVersionUID = 1L;
    @Id
    @GenericGenerator(name = "id", strategy = "native")
    @GeneratedValue(generator = "id")
    @Column(name="id", length = 32)
    private Long id;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id", columnDefinition = "char(32) COMMENT 用户id'")
    private User user;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="role_id", columnDefinition = "char(32) COMMENT '角色id'")
    private Role role;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
