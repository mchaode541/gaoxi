package com.gaoxi.facade.user;

import com.gaoxi.entity.user.UserEntity;
import com.gaoxi.req.user.LoginReq;

public interface UserService {

    public UserEntity login(LoginReq loginReq);
}
