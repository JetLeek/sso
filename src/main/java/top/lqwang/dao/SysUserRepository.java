package top.lqwang.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import top.lqwang.model.SysUser;

/**
 * Created by chenglong on 2017/6/16.
 */
public interface SysUserRepository extends JpaRepository<SysUser,Long> {

    SysUser findByUsername(String username);
}
