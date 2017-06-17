package org.tmf.dsmapi.resourceFunction.api.factories;

import org.tmf.dsmapi.resourceFunction.api.*;
import org.tmf.dsmapi.resourceFunction.api.impl.ResourceFunctionApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-06-15T01:04:08.127Z")
public class ResourceFunctionApiServiceFactory {
    private final static ResourceFunctionApiService service = new ResourceFunctionApiServiceImpl();

    public static ResourceFunctionApiService getResourceFunctionApi() {
        return service;
    }
}
