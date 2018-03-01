package com.base.springbootbase.repository;

import com.base.springbootbase.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yhr
 * @version latest
 * @date 2018/3/1
 */
public interface UserRepository extends JpaRepository<UserInfo, Integer> {

    UserInfo findByUserName(String userName);
}
