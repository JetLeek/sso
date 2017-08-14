package top.leeklong.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import top.leeklong.annotation.Access;
import top.leeklong.enums.MenuEnum;
import top.leeklong.util.CookieUtil;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by pc on 2017/5/5.
 */
@Controller
public class LoginController {
    private static final String LOGIN_PATH="/login";

    @RequestMapping(value = "/login",produces = "application/json;charset=UTF-8",method = RequestMethod.POST)
    @ResponseBody
    @Access(menu = MenuEnum.LOGIN)
    public String login(HttpServletRequest request){
        //1. 获取token
        String token = CookieUtil.getCookie(request,"access_token");

        if (StringUtils.isBlank(token)){
            //1.1 如果token为null,返回到登录页面

            return LOGIN_PATH;
        }else {
            //1.2 如果token不为null,根据token获取用户


        }


        //1.2.1 如果用户为空,返回到登录页面

        //1.2.2 如果用户不为空
        return null;
    }
}
