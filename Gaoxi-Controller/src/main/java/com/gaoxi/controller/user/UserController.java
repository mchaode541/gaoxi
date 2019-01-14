package com.gaoxi.controller.user;

import com.gaoxi.req.user.LoginReq;

import javax.servlet.http.HttpServletResponse;

public interface UserController {
    /**
     * 登录
     * @param loginReq 登录请求参数
     * @param httpRsp HTTP响应
     * @return 登录是否成功
     */

   public void login(LoginReq loginReq, HttpServletResponse httpRsp);
}
