package org.tmf.dsmapi.resourceFunction.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import org.tmf.dsmapi.resourceFunction.model.Heal;
import org.tmf.dsmapi.resourceFunction.model.Migrate;
import org.tmf.dsmapi.resourceFunction.model.ResourceFunction;
import org.tmf.dsmapi.resourceFunction.model.Scale;

import java.util.List;
import org.tmf.dsmapi.resourceFunction.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-06-15T01:04:08.127Z")
public abstract class ResourceFunctionApiService {
    public abstract Response resourceFunctionCreate(ResourceFunction resourceFunction,SecurityContext securityContext) throws NotFoundException;
    public abstract Response resourceFunctionDelete(String id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response resourceFunctionFind(String fields,SecurityContext securityContext) throws NotFoundException;
    public abstract Response resourceFunctionHeal(Heal heal,SecurityContext securityContext) throws NotFoundException;
    public abstract Response resourceFunctionHealDelete(String id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response resourceFunctionHealGet(String id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response resourceFunctionHealPatch(String id,Heal serviceHeal,SecurityContext securityContext) throws NotFoundException;
    public abstract Response resourceFunctionMigrate(Migrate migrate,SecurityContext securityContext) throws NotFoundException;
    public abstract Response resourceFunctionMigrateDelete(String id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response resourceFunctionMigrateGet(String id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response resourceFunctionMigratePatch(String id,Migrate serviceMigrate,SecurityContext securityContext) throws NotFoundException;
    public abstract Response resourceFunctionPatch(String id,ResourceFunction resourceFunction,SecurityContext securityContext) throws NotFoundException;
    public abstract Response resourceFunctionScale(Scale scale,SecurityContext securityContext) throws NotFoundException;
    public abstract Response resourceFunctionScaleDelete(String id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response resourceFunctionScaleGet(String id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response resourceFunctionScalePatch(Scale serviceScale,SecurityContext securityContext) throws NotFoundException;
    public abstract Response resourceFunctionServiceGet(String id,String fields,SecurityContext securityContext) throws NotFoundException;
}
