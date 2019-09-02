package com.ghgcn.dubbo.provider.service.impl;

import java.util.UUID;

import javax.ws.rs.BeanParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Service;

import com.ghgcn.dubbo.api.entity.UserInfo;
import com.ghgcn.dubbo.api.service.UserInfoService;

@Path("userInfo")
@Service("userInfoService")
@Produces(MediaType.APPLICATION_JSON+";"+MediaType.CHARSET_PARAMETER+"=UTF-8")
public class UserInfoServiceImpl implements UserInfoService {

    @Path("/add")
    @POST
    @Override
    public UserInfo addUser(@BeanParam UserInfo userInfo) {
        System.err.println(userInfo);
        return userInfo;
    }

    @Path("/id")
    @POST
    @Override
    public UserInfo getId(@FormParam("id") Integer id) {
        System.err.println(id);
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName(UUID.randomUUID().toString());
        userInfo.setAge(id);
         return userInfo;
    }

}
