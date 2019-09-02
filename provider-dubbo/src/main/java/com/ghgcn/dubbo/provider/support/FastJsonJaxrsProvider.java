package com.ghgcn.dubbo.provider.support;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.ext.Provider;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.jaxrs.FastJsonProvider;

@Provider
@Consumes({ "application/*+json","text/json" })
@Produces({ "application/*+json","text/json" })
public class FastJsonJaxrsProvider extends FastJsonProvider {

    public FastJsonJaxrsProvider() {
        super();
        getFastJsonConfig().setSerializerFeatures(SerializerFeature.DisableCircularReferenceDetect,
                SerializerFeature.WriteBigDecimalAsPlain, SerializerFeature.BrowserCompatible);
    }
}
