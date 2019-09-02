package com.ghgcn.dubbo.provider.support;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.core.Context;

@PreMatching
public class RestResultWrapperFilter implements ContainerRequestFilter, ContainerResponseFilter{
    @Context
    HttpServletRequest request;
    @Context
    HttpServletResponse response;

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
            throws IOException {
        response.setCharacterEncoding(StandardCharsets.UTF_8.name());
        //response.setCharacterEncoding(StandardCharsets.UTF_8.name());
        
    }

    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        request.setCharacterEncoding(StandardCharsets.UTF_8.name());
    }

}
