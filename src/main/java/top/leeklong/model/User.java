package top.leeklong.model;

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
public class User implements Serializable {

    /**
     * 序列化版本号，每次修改model类 应该相应的修改版本号
     */
    private static final long serialVersionUID = 1L;

    private Long id;

    private String username;//用户名

    private String password;//密码

    private Integer userStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }
}
