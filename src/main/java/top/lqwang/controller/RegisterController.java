package top.lqwang.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.lqwang.util.BackResult;
import top.lqwang.util.ServiceUtil;

import static top.lqwang.util.StatusCodeEnum.CODE_1;
import static top.lqwang.util.StatusCodeEnum.CODE_10001;

/**
 * Created by pc on 2017/5/4.
 */
@RestController
public class RegisterController {
    private Logger logger = LoggerFactory.getLogger(RegisterController.class);

    @RequestMapping(value = "/register")
    public ResponseEntity register(@RequestParam("code") String code,
                                   @RequestParam("code_key") String code_key,
                                   @RequestParam("username") String username,
                                   @RequestParam("password") String password,
                                   @RequestParam("password2") String password2,
                                   @RequestParam(value = "uuId",required = false) String uuId){
        logger.info("开始注册...");

        //检查参数,如果有null或空字符串,返回true
        Boolean paramCheckResult = ServiceUtil.validationArgs(code,code_key,username,password,password2);
        if (paramCheckResult){
            logger.info("缺少必要参数...");
            return new ResponseEntity(new BackResult(CODE_1.getCode(),CODE_1.getMsg()), HttpStatus.OK);
        }

        //检查两个密码是否一致
        Boolean passwordEqualCheckResult = ServiceUtil.validatePassword(password,password2);
        if (paramCheckResult){
            logger.info("两次输入的密码不一致...");
            return new ResponseEntity(new BackResult(CODE_10001.getCode(),CODE_10001.getMsg()), HttpStatus.OK);
        }
        return null;
    }
}
