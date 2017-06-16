package top.lqwang.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by chenglong on 2017/6/16.
 * 对webmvc的配置
 */
@Configuration
public class MyWebMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        if (registry.hasMappingForPattern("/static/**")){
            // addResourceHandler对外暴露的路径
            // addResourceLocations文件放置的目录
            registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/**");
        }
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/login").setViewName("login");//访问/login跳转到login.html页面
    }

}
