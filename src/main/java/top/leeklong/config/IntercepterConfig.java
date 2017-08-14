package top.leeklong.config;/**
 * Created by pc on 2017/8/14.
 */

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import top.leeklong.intercepter.AccessIntercepter;

/**
 * 拦截器配置
 *
 * @author lee
 * @create 2017-08-14 11:40
 **/
@Configuration
public class IntercepterConfig extends WebMvcConfigurerAdapter {

    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AccessIntercepter()).addPathPatterns("/**");
    }
}
