package com.yhl.boot.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Charles
 * @Title: User
 * @Package com.yhl.boot.domain
 * @Description: TODO
 * @date 2017/11/3 15:09
 */

@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue
    private long id;
    private String username;
    private String password;

    public long getId() {
        return id;
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
}