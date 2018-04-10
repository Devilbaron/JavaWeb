package com.demon.entity;

import javax.jws.soap.SOAPBinding;

/**
 * 用户类
 *
 */
public class User {

    private String username;
    private String password;
    private long age;

    public User(){

    }

    public User(String user,String pass,long age){
        this.username = user;
        this.password =pass;
        this.age = age;
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

    public long getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
