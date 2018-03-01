package com.base.springbootbase;

import com.base.springbootbase.entity.UserInfo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yhr
 * @version latest
 * @date 2018/3/1
 */

@RestController
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String username, String password, String vcode, Boolean rememberMe) {
        System.out.println(username);
        UsernamePasswordToken token = new UsernamePasswordToken(username, password, rememberMe);
        SecurityUtils.getSubject().login(token);

        return "loginSuccess";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public UserInfo home() {
        Subject subject = SecurityUtils.getSubject();
        UserInfo principal = (UserInfo) subject.getPrincipal();
        return principal;
    }
}
