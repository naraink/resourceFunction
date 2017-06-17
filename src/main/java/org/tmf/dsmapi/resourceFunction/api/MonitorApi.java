package org.tmf.dsmapi.resourceFunction.api;

import io.swagger.model.*;
import org.tmf.dsmapi.resourceFunction.api.factories.MonitorApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.tmf.dsmapi.resourceFunction.model.Monitor;

import java.util.List;
import org.tmf.dsmapi.resourceFunction.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/monitor")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the monitor API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-06-15T01:04:08.127Z")
public class MonitorApi  {
   private final MonitorApiService delegate = MonitorApiServiceFactory.getMonitorApi();

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "monitorFind", notes = "", response = Monitor.class, responseContainer = "List", tags={ "monitor", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of monitor", response = Monitor.class, responseContainer = "List") })
    public Response monitorFind(@ApiParam(value = "") @QueryParam("fields") String fields
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.monitorFind(fields,securityContext);
    }
    @GET
    @Path("/{monitorId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "monitorGet", notes = "", response = Monitor.class, tags={ "monitor", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "monitor", response = Monitor.class) })
    public Response monitorGet(@ApiParam(value = "",required=true) @PathParam("monitorId") String monitorId
,@ApiParam(value = "") @QueryParam("fields") String fields
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.monitorGet(monitorId,fields,securityContext);
    }
    @HEAD
    @Path("/{monitorId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "monitorGet", notes = "", response = Monitor.class, tags={ "monitor", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "monitor", response = Monitor.class) })
    public Response monitorHead(@ApiParam(value = "",required=true) @PathParam("monitorId") String monitorId
,@ApiParam(value = "") @QueryParam("fields") String fields
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.monitorHead(monitorId,fields,securityContext);
    }
}
