package com.base.springbootbase.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author yhr
 * @version latest
 * @date 2018/2/28
 */

@Data
@Entity
@Table(name = "user_info")
public class UserInfo {
    @Id
    @GeneratedValue
    private Integer uid;
    private String userName;//帐号
    private String name;//名称（昵称或者真实姓名，不同系统不同定义）
    private String passWord; //密码;
    private String salt;//加密密码的盐
    private byte state;//用户状态,0:创建未认证（比如没有激活，没有输入验证码等等）--等待验证的用户 , 1:正常状态,2：用户被锁定.
}
