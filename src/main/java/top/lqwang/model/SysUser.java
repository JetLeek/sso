package top.lqwang.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by chenglong on 2017/6/16.
 * 用户实体来实现UserDetails接口，那么我们的用户实体就是Spring Security所使用的用户
 */
@Entity
public class SysUser implements UserDetails, Serializable {

    /**
     * 序列化版本号，每次修改model类 应该相应的修改版本号
     */
    private static final long serialVersionUID = 1L;

    @Id//标识主键
    @GeneratedValue//两个注解结合相当于调用native策略
    private Long id;

    private String username;//用户名

    private String password;//密码

    @ManyToMany(fetch = FetchType.LAZY)
    private List<SysRole> roles;//配置用户和角色的多对多的关系

    /**
     * 将用户的角色作为权限
     * @return
     */
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> auths = new ArrayList<GrantedAuthority>();
        List<SysRole> roles = this.getRoles();
        if (roles!=null&&roles.size()>0){
            for (SysRole role:roles){
                if (role!=null){
                    auths.add(new SimpleGrantedAuthority(role.getName()));
                }
            }
        }
        return auths;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }


    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<SysRole> getRoles() {
        return roles;
    }

    public void setRoles(List<SysRole> roles) {
        this.roles = roles;
    }
}
