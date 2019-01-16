package com.gaoxi.controller.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
@RestController
public interface UserController {
    /**
     * 登录
     * @param httpRsp HTTP响应
     * @return 登录是否成功
     */
    @GetMapping("/login")
   public void login(HttpServletResponse httpRsp);

    @GetMapping("/test")
    public String test();
}
