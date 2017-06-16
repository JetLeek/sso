package top.lqwang.config;/**
 * Created by pc on 2017/6/16.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;
import top.lqwang.service.CustomUserService;

import javax.sql.DataSource;


/**
 * 安全认证
 *
 * @author lee
 * @create 2017-06-16 18:17
 **/
@Configuration
@EnableWebSecurity
@Import(DataBaseConnection.class)
public class MyWebSecurityConfiguration extends WebSecurityConfigurerAdapter{


    @Autowired
    DataSource dataSource;

    @Bean
    UserDetailsService customUserService(){
        return new CustomUserService();
    }

    /**
     * 请求授权
     * @param http
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        super.configure(http);

//        http.authorizeRequests()//开始请求权限配置
//                .antMatchers("/base/**").hasAnyRole("admin")//只有admin用户可以访问
//        .antMatchers("/user1/**").hasAnyRole("admin","user1")//admin和user1可以访问
//        .antMatchers("/common/**").anonymous()//匿名用户可以访问
//        .anyRequest().authenticated();//其余的所有请求都需要认证

        http.authorizeRequests().anyRequest().authenticated()// 所有的请求都需要认证即登录
                .and()
                .formLogin()
                    .loginPage("/login")
                    .failureUrl("/login?error")
                    .permitAll()                //定制登录行为，登录页面可以随意访问
                .and()
                .logout()
                .permitAll();                   //定制注销行为，注销行为可以随意访问
    }

    /**
     * 用户认证
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
//        super.configure(auth);
        /**
         * 内存中的用户认证
         */
//        auth.inMemoryAuthentication()
//                .withUser("ChengLong").password("ChengLong").roles("admin")
//                .and()
//                .withUser("LinQiao").password("LinQiao").roles("user2");

        auth.userDetailsService(customUserService());//添加自定义的用户认证
    }

    @Override
    public void configure(WebSecurity webSecurity) throws Exception {
        super.configure(webSecurity);



    }
}
