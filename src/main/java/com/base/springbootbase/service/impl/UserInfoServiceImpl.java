package com.base.springbootbase.service.impl;

import com.base.springbootbase.entity.UserInfo;
import com.base.springbootbase.repository.UserRepository;
import com.base.springbootbase.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yhr
 * @version latest
 * @date 2018/2/28
 */

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserInfo findByUsername(String userName) {
        return userRepository.findByUserName(userName);
    }
}
