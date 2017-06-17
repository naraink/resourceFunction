package org.tmf.dsmapi.resourceFunction.api;


import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import org.tmf.dsmapi.resourceFunction.model.Hub;
import org.tmf.dsmapi.resourceFunction.model.ResourceFunction;

import java.util.List;
import org.tmf.dsmapi.resourceFunction.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-06-15T01:04:08.127Z")
public abstract class HubApiService {
    public abstract Response hubCreate(Hub hub,SecurityContext securityContext) throws NotFoundException;
    public abstract Response hubDelete(String hubId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response hubFind(SecurityContext securityContext) throws NotFoundException;
    public abstract Response hubGet(String hubId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response resourceFunctionCreateNotification(ResourceFunction resourceFunction_,SecurityContext securityContext) throws NotFoundException;
    public abstract Response resourceFunctionDeleteNotification(ResourceFunction resourceFunction,SecurityContext securityContext) throws NotFoundException;
    public abstract Response resourceFunctionModificationNotification(ResourceFunction resourceFunction_,SecurityContext securityContext) throws NotFoundException;
}
