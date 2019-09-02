package com.ghgcn.dubbo.api.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


public class UserInfo implements Serializable {

    
    /**
     * 
     */
    private static final long serialVersionUID = -5150581146883326805L;

    private String userName;
    
    private Integer age;
    
    private  Date  birthday;

    
    public String getUserName() {
        return userName;
    }

    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    
    public Integer getAge() {
        return age;
    }

    
    public void setAge(Integer age) {
        this.age = age;
    }

    
    public Date getBirthday() {
        return birthday;
    }

    
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }


    @Override
    public String toString() {
        return "UserInfo [userName=" + userName + ", age=" + age + ", birthday=" + birthday + "]";
    }
    
    
    
}
