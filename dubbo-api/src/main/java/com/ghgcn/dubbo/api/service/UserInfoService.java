package com.ghgcn.dubbo.api.service;

import com.ghgcn.dubbo.api.entity.UserInfo;

public interface UserInfoService {

    
    public UserInfo addUser(UserInfo userInfo);

    UserInfo getId(Integer id);
    
    
    
}
