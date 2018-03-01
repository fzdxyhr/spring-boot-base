package com.base.springbootbase.service;

import com.base.springbootbase.entity.UserInfo;

/**
 * @author yhr
 * @version latest
 * @date 2018/2/28
 */
public interface UserInfoService {

    UserInfo findByUsername(String userName);
}
