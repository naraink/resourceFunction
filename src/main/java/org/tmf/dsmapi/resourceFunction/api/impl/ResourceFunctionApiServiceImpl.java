package org.tmf.dsmapi.resourceFunction.api.impl;

import org.tmf.dsmapi.resourceFunction.api.ApiResponseMessage;

import org.tmf.dsmapi.resourceFunction.model.Heal;
import org.tmf.dsmapi.resourceFunction.model.Migrate;
import org.tmf.dsmapi.resourceFunction.model.ResourceFunction;
import org.tmf.dsmapi.resourceFunction.model.Scale;

import java.util.List;
import org.tmf.dsmapi.resourceFunction.api.NotFoundException;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import org.tmf.dsmapi.commons.exceptions.BadUsageException;
import org.tmf.dsmapi.commons.exceptions.UnknownResourceException;
import org.tmf.dsmapi.resourceFunction.ResourceFunctionFacade;
import org.tmf.dsmapi.resourceFunction.api.*;

@Stateless
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-06-15T01:04:08.127Z")
public class ResourceFunctionApiServiceImpl extends ResourceFunctionApiService {

    @EJB
    ResourceFunctionFacade resourceFunctionFacade;

    @Override
    public Response resourceFunctionCreate(ResourceFunction resourceFunction, SecurityContext securityContext) throws NotFoundException {
        try {
            resourceFunctionFacade.create(resourceFunction);
            return Response.ok().entity(resourceFunction).build();

        } catch (BadUsageException ex) {
            Logger.getLogger(ResourceFunctionApiServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }

    @Override
    public Response resourceFunctionDelete(String id, SecurityContext securityContext) throws NotFoundException {
        try {
            resourceFunctionFacade.remove(Long.parseLong(id));
            
            return Response.status(Response.Status.NO_CONTENT).build();
        } catch (UnknownResourceException ex) {
            Logger.getLogger(ResourceFunctionApiServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Response.serverError().build();
    }

    @Override
    public Response resourceFunctionFind(String fields, SecurityContext securityContext) throws NotFoundException {
        return Response.ok().entity(resourceFunctionFacade.findAll()).build();
    }

    @Override
    public Response resourceFunctionHeal(Heal heal, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }

    @Override
    public Response resourceFunctionHealDelete(String id, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }

    @Override
    public Response resourceFunctionHealGet(String id, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }

    @Override
    public Response resourceFunctionHealPatch(String id, Heal serviceHeal, SecurityContext securityContext) throws NotFoundException {
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }

    @Override
    public Response resourceFunctionMigrate(Migrate migrate, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }

    @Override
    public Response resourceFunctionMigrateDelete(String id, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }

    @Override
    public Response resourceFunctionMigrateGet(String id, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }

    @Override
    public Response resourceFunctionMigratePatch(String id, Migrate serviceMigrate, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }

    @Override
    public Response resourceFunctionPatch(String id, ResourceFunction resourceFunction, SecurityContext securityContext) throws NotFoundException {
        try {
            resourceFunctionFacade.patchObject(Long.parseLong(id), resourceFunction);
            return Response.ok().entity(resourceFunction).build();
        } catch (UnknownResourceException ex) {
            Logger.getLogger(ResourceFunctionApiServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadUsageException ex) {
            Logger.getLogger(ResourceFunctionApiServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Response.serverError().build();
    }

    @Override
    public Response resourceFunctionScale(Scale scale, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }

    @Override
    public Response resourceFunctionScaleDelete(String id, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }

    @Override
    public Response resourceFunctionScaleGet(String id, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }

    @Override
    public Response resourceFunctionScalePatch(Scale serviceScale, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }

    @Override
    public Response resourceFunctionServiceGet(String id, String fields, SecurityContext securityContext) throws NotFoundException {
        try {
            System.out.println("org.tmf.dsmapi.resourceFunction.api.impl.ResourceFunctionApiServiceImpl.resourceFunctionServiceGet() FINDING " + id);
            return Response.ok().entity(resourceFunctionFacade.find(Long.parseLong(id))).build();
        } catch (UnknownResourceException ex) {
            Logger.getLogger(ResourceFunctionApiServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
            return Response.noContent().build();

    }
}
