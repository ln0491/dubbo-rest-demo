package com.ghgcn.dubbo.provider.service.impl;



import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Service;

import com.ghgcn.dubbo.api.entity.UserInfo;
import com.ghgcn.dubbo.api.service.RestInfoService;

@Path("restInfo")
@Service("restInfoService")
@Produces(MediaType.APPLICATION_JSON+";"+MediaType.CHARSET_PARAMETER+"=UTF-8")
//@Consumes(MediaType.APPLICATION_JSON+";"+MediaType.CHARSET_PARAMETER+"=UTF-8")
public class RestInfoServiceImpl implements RestInfoService {

    @Path("/getRest")
    @GET
    @Override
    public Object getRest() {
        
        UserInfo userInfo = new UserInfo();
        userInfo.setAge(32);
        userInfo.setBirthday(new Date() );
        userInfo.setUserName("斜体范德萨");
        return userInfo;
    }

}
