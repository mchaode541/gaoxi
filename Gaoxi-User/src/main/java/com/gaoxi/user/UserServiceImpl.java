package com.gaoxi.user;

import com.alibaba.dubbo.config.annotation.Service;
import com.gaoxi.dao.UserDao;
import com.gaoxi.entity.user.UserEntity;
import com.gaoxi.facade.user.UserService;
import com.gaoxi.req.user.LoginReq;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 描述:
 *
 * @author chaom
 * @create 2019-01-11 17:10
 */
@Service(version = "${Gaoxi.service.version}")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserEntity login() {
        userDao.login();
        return null;
    }
}