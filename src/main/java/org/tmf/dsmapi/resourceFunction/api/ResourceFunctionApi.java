package org.tmf.dsmapi.resourceFunction.api;

import io.swagger.model.*;
import org.tmf.dsmapi.resourceFunction.api.ResourceFunctionApiService;
import org.tmf.dsmapi.resourceFunction.api.factories.ResourceFunctionApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.tmf.dsmapi.resourceFunction.model.Heal;
import org.tmf.dsmapi.resourceFunction.model.Migrate;
import org.tmf.dsmapi.resourceFunction.model.ResourceFunction;
import org.tmf.dsmapi.resourceFunction.model.Scale;

import java.util.List;
import org.tmf.dsmapi.resourceFunction.api.NotFoundException;

import java.io.InputStream;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import org.tmf.dsmapi.resourceFunction.api.impl.ResourceFunctionApiServiceImpl;

@Stateless
@Path("/resourceFunction")
@Consumes({"application/json"})
@Produces({"application/json"})
@io.swagger.annotations.Api(description = "the resourceFunction API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-06-15T01:04:08.127Z")
public class ResourceFunctionApi {

    @EJB
    private ResourceFunctionApiServiceImpl resourceFunctionApiServiceImpl;

    @POST

    @Consumes({"application/json"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "ResourceFunctionCreate", notes = "Create a new Resource Function. A resource function could be composite or atomic", response = ResourceFunction.class, tags = {"ResourceFunction",})
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 201, message = "ResourceFunction", response = ResourceFunction.class)})
    public Response resourceFunctionCreate(@ApiParam(value = "", required = true) ResourceFunction resourceFunction,
             @Context SecurityContext securityContext)
            throws NotFoundException {
        return resourceFunctionApiServiceImpl.resourceFunctionCreate(resourceFunction, securityContext);
    }

    @DELETE
    @Path("/{id}")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "ResourceFunctionDelete", notes = "Delete a resource function", response = void.class, tags = {"ResourceFunction",})
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 204, message = "Success", response = void.class)})
    public Response resourceFunctionDelete(@ApiParam(value = "", required = true) @PathParam("id") String id,
             @Context SecurityContext securityContext)
            throws NotFoundException {
        return resourceFunctionApiServiceImpl.resourceFunctionDelete(id, securityContext);
    }

    @GET

    @Consumes({"application/json"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "ResourceFunctionFind", notes = "Find a particular Resource Function by providing query parameters", response = ResourceFunction.class, responseContainer = "List", tags = {"ResourceFunction",})
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "List of Resource Functions", response = ResourceFunction.class, responseContainer = "List")})
    public Response resourceFunctionFind(@ApiParam(value = "Input fields used to find a particular resource function") @QueryParam("fields") String fields,
             @Context SecurityContext securityContext)
            throws NotFoundException {
        return resourceFunctionApiServiceImpl.resourceFunctionFind(fields, securityContext);
    }

    @POST
    @Path("/heal")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "Heal Resource Function", notes = "Operation to heal the resource function. This returns the heal task resource that can be queried to get the latest status of the heal operation ", response = Heal.class, tags = {"ResourceFunction/Heal",})
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 201, message = "ResourceFunctionHeal", response = Heal.class)})
    public Response resourceFunctionHeal(@ApiParam(value = "", required = true) Heal heal,
             @Context SecurityContext securityContext)
            throws NotFoundException {
        return resourceFunctionApiServiceImpl.resourceFunctionHeal(heal, securityContext);
    }

    @DELETE
    @Path("/heal/{id}")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "ResourceFunctionHealDelete", notes = "Cancel the request to heal the network service. This operation is performed on a best effort basis.", response = void.class, tags = {"ResourceFunction/Heal",})
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 204, message = "Success", response = void.class)})
    public Response resourceFunctionHealDelete(@ApiParam(value = "Id of the heal operation that is returned as a response to the post.", required = true) @PathParam("id") String id,
             @Context SecurityContext securityContext)
            throws NotFoundException {
        return resourceFunctionApiServiceImpl.resourceFunctionHealDelete(id, securityContext);
    }

    @GET
    @Path("/heal/{id}")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "ResourceFunctionHealGet", notes = "Get the current status of the heal operation.", response = Heal.class, tags = {"ResourceFunction/Heal",})
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "ServiceHeal", response = Heal.class)})
    public Response resourceFunctionHealGet(@ApiParam(value = "Id of the heal operation that is returned as a response to the post.", required = true) @PathParam("id") String id,
             @Context SecurityContext securityContext)
            throws NotFoundException {
        return resourceFunctionApiServiceImpl.resourceFunctionHealGet(id, securityContext);
    }

    @PATCH
    @Path("/heal/{id}")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "ResourceFunctionHealPatch", notes = "Patch the Network Service heal request. For e.g. provide additional parameters when the request has failed.", response = Heal.class, tags = {"ResourceFunction/Heal",})
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "ServiceHealPatchSuccess", response = Heal.class)})
    public Response resourceFunctionHealPatch(@ApiParam(value = "Id of the heal request that was returned as part of the post operation", required = true) @PathParam("id") String id,
             @ApiParam(value = "Attributes of the heal request to be patched.", required = true) Heal serviceHeal,
             @Context SecurityContext securityContext)
            throws NotFoundException {
        return resourceFunctionApiServiceImpl.resourceFunctionHealPatch(id, serviceHeal, securityContext);
    }

    @POST
    @Path("/migrate")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "Migrate Network Service", notes = "Operation to Migrate the network service. This returns the Migrate task resource that can be queried to get the latest status of the Migrate operation ", response = Migrate.class, tags = {"ResourceFunction/Migrate",})
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 201, message = "ResourceFunctionMigrate", response = Migrate.class)})
    public Response resourceFunctionMigrate(@ApiParam(value = "", required = true) Migrate migrate,
             @Context SecurityContext securityContext)
            throws NotFoundException {
        return resourceFunctionApiServiceImpl.resourceFunctionMigrate(migrate, securityContext);
    }

    @DELETE
    @Path("/migrate/{id}")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "ResourceFunctionMigrateDelete", notes = "Cancel the request to Migrate the network service. This operation is performed on a best effort basis.", response = void.class, tags = {"ResourceFunction/Migrate",})
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 204, message = "Success", response = void.class)})
    public Response resourceFunctionMigrateDelete(@ApiParam(value = "Id of the Migrate operation that is returned as a response to the post.", required = true) @PathParam("id") String id,
             @Context SecurityContext securityContext)
            throws NotFoundException {
        return resourceFunctionApiServiceImpl.resourceFunctionMigrateDelete(id, securityContext);
    }

    @GET
    @Path("/migrate/{id}")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "ResourceFunctionMigrateGet", notes = "Get the current status of the Migrate operation.", response = Migrate.class, tags = {"ResourceFunction/Migrate",})
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "ServiceMigrate", response = Migrate.class)})
    public Response resourceFunctionMigrateGet(@ApiParam(value = "Id of the Migrate operation that is returned as a response to the post.", required = true) @PathParam("id") String id,
             @Context SecurityContext securityContext)
            throws NotFoundException {
        return resourceFunctionApiServiceImpl.resourceFunctionMigrateGet(id, securityContext);
    }

    @PATCH
    @Path("/migrate/{id}")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "ResourceFunctionMigratePatch", notes = "Patch the Network Service heal request. For e.g. provide additional parameters when the request has failed.", response = Migrate.class, tags = {"ResourceFunction/Migrate",})
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "MigrateRequestPatchSuccess", response = Migrate.class)})
    public Response resourceFunctionMigratePatch(@ApiParam(value = "Id of the Migrate request that was returned as part of the post operation", required = true) @PathParam("id") String id,
             @ApiParam(value = "Attributes of the request to be patched.", required = true) Migrate serviceMigrate,
             @Context SecurityContext securityContext)
            throws NotFoundException {
        return resourceFunctionApiServiceImpl.resourceFunctionMigratePatch(id, serviceMigrate, securityContext);
    }

    @PATCH
    @Path("/{id}")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "ResourceFunctionPatch", notes = "", response = ResourceFunction.class, tags = {"ResourceFunction",})
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Resource Function Patch Success", response = ResourceFunction.class)})
    public Response resourceFunctionPatch(@ApiParam(value = "", required = true) @PathParam("id") String id,
             @ApiParam(value = "", required = true) ResourceFunction resourceFunction,
             @Context SecurityContext securityContext)
            throws NotFoundException {
        return resourceFunctionApiServiceImpl.resourceFunctionPatch(id, resourceFunction, securityContext);
    }

    @POST
    @Path("/scale")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "Scale Network Service", notes = "Operation to scale the network service. This returns the scale task resource that can be queried to get the latest status of the scale operation ", response = Scale.class, tags = {"ResourceFunction/Scale",})
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 201, message = "ResourceFunctionScale", response = Scale.class)})
    public Response resourceFunctionScale(@ApiParam(value = "", required = true) Scale scale,
             @Context SecurityContext securityContext)
            throws NotFoundException {
        return resourceFunctionApiServiceImpl.resourceFunctionScale(scale, securityContext);
    }

    @DELETE
    @Path("/scale/{id}")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "ResourceFunctionScaleDelete", notes = "Cancel the request to scale the network service. This operation is performed on a best effort basis.", response = void.class, tags = {"ResourceFunction/Scale",})
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 204, message = "Success", response = void.class)})
    public Response resourceFunctionScaleDelete(@ApiParam(value = "Id of the scale operation that is returned as a response to the post.", required = true) @PathParam("id") String id,
             @Context SecurityContext securityContext)
            throws NotFoundException {
        return resourceFunctionApiServiceImpl.resourceFunctionScaleDelete(id, securityContext);
    }

    @GET
    @Path("/scale/{id}")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "ResourceFunctionScaleGet", notes = "Get the current status of the scale operation.", response = Scale.class, tags = {"ResourceFunction/Scale",})
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "ServiceScale", response = Scale.class)})
    public Response resourceFunctionScaleGet(@ApiParam(value = "Id of the scale operation that is returned as a response to the post.", required = true) @PathParam("id") String id,
             @Context SecurityContext securityContext)
            throws NotFoundException {
        return resourceFunctionApiServiceImpl.resourceFunctionScaleGet(id, securityContext);
    }

    @PATCH
    @Path("/scale/{id}")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "ResourceFunctionScalePatch", notes = "Patch the Network Service heal request. For e.g. provide additional parameters when the request has failed.", response = Scale.class, tags = {"ResourceFunction/Scale",})
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "ScaleRequestPatchSuccess", response = Scale.class)})
    public Response resourceFunctionScalePatch(@ApiParam(value = "Attributes of the request to be patched.", required = true) Scale serviceScale,
             @Context SecurityContext securityContext)
            throws NotFoundException {
        return resourceFunctionApiServiceImpl.resourceFunctionScalePatch(serviceScale, securityContext);
    }

    @GET
    @Path("/{id}")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    @io.swagger.annotations.ApiOperation(value = "ResourceFunctionServiceGet", notes = "", response = ResourceFunction.class, tags = {"ResourceFunction",})
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Resource Function", response = ResourceFunction.class)})
    public Response resourceFunctionServiceGet(@ApiParam(value = "", required = true) @PathParam("id") String id,
             @ApiParam(value = "") @QueryParam("fields") String fields,
             @Context SecurityContext securityContext)
            throws NotFoundException {
        return resourceFunctionApiServiceImpl.resourceFunctionServiceGet(id, fields, securityContext);
    }
}
