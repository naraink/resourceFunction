package org.tmf.dsmapi.resourceFunction.api;

import io.swagger.model.*;
import org.tmf.dsmapi.resourceFunction.api.HubApiService;
import org.tmf.dsmapi.resourceFunction.api.factories.HubApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.tmf.dsmapi.resourceFunction.model.Hub;
import org.tmf.dsmapi.resourceFunction.model.ResourceFunction;

import java.util.List;
import org.tmf.dsmapi.resourceFunction.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/hub")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the hub API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-06-15T01:04:08.127Z")
public class HubApi  {
   private final HubApiService delegate = HubApiServiceFactory.getHubApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "hubCreate", notes = "", response = Hub.class, tags={ "hub", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Hub", response = Hub.class) })
    public Response hubCreate(@ApiParam(value = "" ,required=true) Hub hub
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.hubCreate(hub,securityContext);
    }
    @DELETE
    @Path("/{hubId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "hubDelete", notes = "", response = void.class, tags={ "hub", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "Success", response = void.class) })
    public Response hubDelete(@ApiParam(value = "",required=true) @PathParam("hubId") String hubId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.hubDelete(hubId,securityContext);
    }
    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "hubFind", notes = "", response = Hub.class, responseContainer = "List", tags={ "hub", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of Hub", response = Hub.class, responseContainer = "List") })
    public Response hubFind(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.hubFind(securityContext);
    }
    @GET
    @Path("/{hubId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "hubGet", notes = "", response = Hub.class, tags={ "hub", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Hub", response = Hub.class) })
    public Response hubGet(@ApiParam(value = "",required=true) @PathParam("hubId") String hubId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.hubGet(hubId,securityContext);
    }
    @POST
    @Path("/resourceFunctionCreateNotification")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Notification when a Resource Function is created", notes = "", response = ResourceFunction.class, tags={ "notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "ResourceFunction ", response = ResourceFunction.class) })
    public Response resourceFunctionCreateNotification(@ApiParam(value = "" ,required=true) ResourceFunction resourceFunction_
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.resourceFunctionCreateNotification(resourceFunction_,securityContext);
    }
    @POST
    @Path("/resourceFunctionDeleteNotification")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Notification when a resource function is deleted", notes = "", response = ResourceFunction.class, tags={ "notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource Function", response = ResourceFunction.class) })
    public Response resourceFunctionDeleteNotification(@ApiParam(value = "" ,required=true) ResourceFunction resourceFunction
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.resourceFunctionDeleteNotification(resourceFunction,securityContext);
    }
    @POST
    @Path("/resourceFunctionModificationNotification")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Notification of modification of Resource Function", notes = "", response = ResourceFunction.class, tags={ "notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Modified Resource Function ", response = ResourceFunction.class) })
    public Response resourceFunctionModificationNotification(@ApiParam(value = "" ,required=true) ResourceFunction resourceFunction_
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.resourceFunctionModificationNotification(resourceFunction_,securityContext);
    }
}
