package org.tmf.dsmapi.resourceFunction.api.factories;

import org.tmf.dsmapi.resourceFunction.api.HubApiService;
import org.tmf.dsmapi.resourceFunction.api.impl.HubApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-06-15T01:04:08.127Z")
public class HubApiServiceFactory {
    private final static HubApiService service = new HubApiServiceImpl();

    public static HubApiService getHubApi() {
        return service;
    }
}
