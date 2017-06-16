package top.lqwang.util;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author kayson Yang
 * @description
 * @create 2016-10-17 9:44
 */
public class ServiceUtil {

    private static Logger logger = LoggerFactory.getLogger(ServiceUtil.class);

    /**
     * @description: check args of input
     * @Date:  2016/10/8
     * @pram:   args
     * @return:  flag
     */
    public static Boolean validationArgs(String... args){
        Boolean flag = false;
        for (String param:args) {
            if(StringUtils.isBlank(param)){
                flag = true;
                break;
            }
        }
        return flag;
    }



    /**
     * @description: check password, password2
     * @Date:  2016/10/8
     * @pram:   password
                password2
     * @return:  flag
     */
    public static Boolean validatePassword(String password,String password2){
        Boolean flag = false;
        if (!password.equals(password2)){
            flag = true;
        }

        return flag;
    }



    /**
     * validate mobile no format
     *
     * @param username
     * @return
     */
    public static Boolean validateUserName(String username) {
        Boolean flag = false;
        try {
            String regExpression = "\\d{11}";
            if (StringUtils.isNotBlank(username) ) {
                return username.matches(regExpression);
            }
        } catch (Exception E) {
            logger.error("validate UserName error: "+E);
            flag = false;
        }
        return flag;
    }



    /**
     * validate mobile no format
     *
     * @param mobile
     * @return
     */
    public static boolean validateMobile(String mobile) {
        boolean flag = false;
        try {

            //String regEx = "\\d{11}";
            if (StringUtils.isNotBlank(mobile)) {
                //return mobile.matches(regEx);
                Pattern p = Pattern.compile("^1[3|4|5|7|8|9]\\d{9}$");
                Matcher m = p.matcher(mobile);
                return m.matches();
            }
        } catch (Exception e) {
            logger.error("validate mobile error: "+e);
            flag = false;
        }
        return flag;
    }
}
