package com.yhl.boot.exception;

import org.springframework.security.core.AuthenticationException;

/**
 * @author Charles
 * @Title: UsernameIsExitedException
 * @Package com.yhl.boot.exception
 * @Description: TODO
 * @date 2017/11/3 15:12
 */
public class UsernameIsExitedException extends AuthenticationException {

    public UsernameIsExitedException(String msg) {
        super(msg);
    }

    public UsernameIsExitedException(String msg, Throwable t) {
        super(msg, t);
    }

}
