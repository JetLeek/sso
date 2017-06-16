package top.lqwang.config;/**
 * Created by pc on 2017/6/16.
 */

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 安全认证
 *
 * @author lee
 * @create 2017-06-16 18:17
 **/
@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter{

    /**
     * spring security的配置
     * @param http
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        super.configure(http);
    }

    /**
     * 用户认证
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        super.configure(auth);

        /**
         * 内存中的用户认证
         */
        auth.inMemoryAuthentication()
                .withUser("ChengLong").password("ChengLong").roles("ROLE_ADMIN")
                .and()
                .withUser("LinQiao").password("LinQiao").roles("ROLE_USER");
    }

    @Override
    public void configure(WebSecurity webSecurity) throws Exception {
        super.configure(webSecurity);



    }
}
