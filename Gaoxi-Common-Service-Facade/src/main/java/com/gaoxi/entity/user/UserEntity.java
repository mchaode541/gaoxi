package com.gaoxi.entity.user;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 描述:
 *
 * @author chaom
 * @create 2019-01-11 16:52
 */
public class UserEntity implements Serializable {

    /** 主键 */
    private String id;

    /** 用户名 */
    private String username;

    /** 密码 */
    private String password;

    /** 手机号 */
    private String phone;

    /** 邮箱 */
    private String mail;

    /** 营业执照照片 */
    private String licencePic;

    /** 注册时间 */
    private Timestamp registerTime;

    /** 用户类型 {@link com.gaoxi.enumeration.user.UserTypeEnum} */
   // private UserTypeEnum userTypeEnum;

    /** 账号状态 {@link com.gaoxi.enumeration.user.UserStateEnum } */
   // private UserStateEnum userStateEnum;

    /** 用户的角色 */
   // private RoleEntity roleEntity;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getLicencePic() {
        return licencePic;
    }

    public void setLicencePic(String licencePic) {
        this.licencePic = licencePic;
    }

    public Timestamp getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Timestamp registerTime) {
        this.registerTime = registerTime;
    }
}