package com.gaoxi.user;

import com.alibaba.dubbo.config.annotation.Service;
import com.gaoxi.entity.user.UserEntity;
import com.gaoxi.facade.user.UserService;
import com.gaoxi.req.user.LoginReq;

/**
 * 描述:
 *
 * @author chaom
 * @create 2019-01-11 17:10
 */
@Service(version = "1.0.0")
@org.springframework.stereotype.Service
public class UserServiceImpl implements UserService {

    @Override
    public UserEntity login(LoginReq loginReq) {

        return null;
    }
}