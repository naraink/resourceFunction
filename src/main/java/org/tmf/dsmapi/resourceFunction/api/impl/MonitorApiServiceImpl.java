package org.tmf.dsmapi.resourceFunction.api.impl;

import org.tmf.dsmapi.resourceFunction.api.ApiResponseMessage;
import javax.ws.rs.NotFoundException;


import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import org.tmf.dsmapi.resourceFunction.api.MonitorApiService;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-06-15T01:04:08.127Z")
public class MonitorApiServiceImpl extends MonitorApiService {
    @Override
    public Response monitorFind(String fields, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response monitorGet(String monitorId, String fields, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response monitorHead(String monitorId, String fields, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
