package com.gaoxi.controller.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gaoxi.entity.user.UserEntity;
import com.gaoxi.facade.user.UserService;
import com.gaoxi.req.user.LoginReq;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * 描述:
 *
 * @author chaom
 * @create 2019-01-08 16:18
 */
@RestController
public class UserControllerImpl implements UserController {

    @Reference(version = "${Gaoxi.service.version}")
    private UserService userService;

    @Override
    public void login( HttpServletResponse httpRsp) {
        // 登录鉴权
        UserEntity userEntity = userService.login();
        // 登录成功
       // doLoginSuccess(userEntity, httpRsp);
        System.out.println(">>>调用到登录系统啦啦啦啦啦啦啦");
    }

    @Override
    public String test() {
        return "hello world";
    }


}