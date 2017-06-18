package org.tmf.dsmapi.resourceFunction.api.impl;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.tmf.dsmapi.resourceFunction.api.ApiResponseMessage;
import org.tmf.dsmapi.resourceFunction.api.HubApiService;
import org.tmf.dsmapi.resourceFunction.api.NotFoundException;
import org.tmf.dsmapi.resourceFunction.model.Hub;
import org.tmf.dsmapi.resourceFunction.model.ResourceFunction;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-06-15T01:04:08.127Z")
public class HubApiServiceImpl extends HubApiService {
    @Override
    public Response hubCreate(Hub hub, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response hubDelete(String hubId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response hubFind(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response hubGet(String hubId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response resourceFunctionCreateNotification(ResourceFunction resourceFunction_, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response resourceFunctionDeleteNotification(ResourceFunction resourceFunction, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response resourceFunctionModificationNotification(ResourceFunction resourceFunction_, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
