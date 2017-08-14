//package top.leeklong.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import top.leeklong.dao.UserRepository;
//import top.leeklong.model.User;
//
///**
// * Created by chenglong on 2017/6/16.
// */
//public class CustomUserService implements UserDetailsService {
//
//    @Autowired
//    UserRepository sysUserRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User sysUser = sysUserRepository.findByUsername(username);
//        if (sysUser == null){
//            throw new UsernameNotFoundException("用户名不存在");
//        }
//        return null;
//    }
//}
