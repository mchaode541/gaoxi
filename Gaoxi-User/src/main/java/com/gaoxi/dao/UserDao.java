package com.gaoxi.dao;


import org.springframework.stereotype.Repository;

/**
 * 描述:
 *
 * @author chaom
 * @create 2019-01-11 17:15
 */
@Repository
public class UserDao {


    public void login() {
        System.out.println(">>>>调用到了Dao");
    }
}