package org.tmf.dsmapi.resourceFunction.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;


import java.util.List;
import org.tmf.dsmapi.resourceFunction.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-06-15T01:04:08.127Z")
public abstract class MonitorApiService {
    public abstract Response monitorFind(String fields,SecurityContext securityContext) throws NotFoundException;
    public abstract Response monitorGet(String monitorId,String fields,SecurityContext securityContext) throws NotFoundException;
    public abstract Response monitorHead(String monitorId,String fields,SecurityContext securityContext) throws NotFoundException;
}
