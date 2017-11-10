package com.yhl.boot.common;

import org.springframework.util.DigestUtils;

/**
 * @author Charles
 * @Title: PasswordUtil
 * @Package com.yhl.boot.common
 * @Description: TODO
 * @date 2017/11/3 15:50
 */
public class PasswordUtil {
    public static String getPassword(String password){
        return DigestUtils.md5DigestAsHex(password.getBytes());
    }

    public static void main(String[] args) {
        System.out.println(getPassword("123456"));
    }
}
