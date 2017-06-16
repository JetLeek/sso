package top.lqwang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import top.lqwang.dao.SysUserRepository;
import top.lqwang.model.SysUser;

/**
 * Created by chenglong on 2017/6/16.
 */
public class CustomUserService implements UserDetailsService {

    @Autowired
    SysUserRepository sysUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser sysUser = sysUserRepository.findByUsername(username);
        if (sysUser == null){
            throw new UsernameNotFoundException("用户名不存在");
        }
        return sysUser;
    }
}
