package org.tmf.dsmapi.resourceFunction.api.factories;


import org.tmf.dsmapi.resourceFunction.api.MonitorApiService;
import org.tmf.dsmapi.resourceFunction.api.impl.MonitorApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-06-15T01:04:08.127Z")
public class MonitorApiServiceFactory {
    private final static MonitorApiService service = new MonitorApiServiceImpl();

    public static MonitorApiService getMonitorApi() {
        return service;
    }
}
