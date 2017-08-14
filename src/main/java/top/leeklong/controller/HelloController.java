package top.leeklong.controller;/**
 * Created by pc on 2017/8/14.
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.leeklong.annotation.Access;
import top.leeklong.enums.MenuEnum;

/**
 * hello
 *
 * @author lee
 * @create 2017-08-14 11:41
 **/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    @Access(menu = MenuEnum.LOGIN)
    public String hello(){
        System.out.println("hello world");
        return "";
    }
}
