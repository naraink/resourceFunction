package org.tmf.dsmapi.resourceFunction;

/**
 * This class serves as the "facade" that provides the persistence context to
 * the ResourceFunction entity Requests on the ResourceFunction resource are
 * executed via the ResourceFunctionFacade
 *
 */
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.tmf.dsmapi.commons.facade.AbstractFacade;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.tmf.dsmapi.commons.exceptions.BadUsageException;
import org.tmf.dsmapi.commons.exceptions.ExceptionType;
import org.tmf.dsmapi.commons.exceptions.UnknownResourceException;
import org.tmf.dsmapi.resourceFunction.model.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonpatch.mergepatch.JsonMergePatch;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import org.tmf.dsmapi.commons.utils.BeanUtils;

@Stateless
public class ResourceFunctionFacade extends AbstractFacade<ResourceFunction> {

    @PersistenceContext(unitName = "DSResourceFunctionPU")
    private EntityManager em;

    public ResourceFunctionFacade() {
        // Initialize the AbstractFacade to handle the ResourceFunction Class
        super(ResourceFunction.class);
    }

    // Override the abstract method
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    public ResourceFunction patchObject(Long id, final ResourceFunction resourceFunctionPatch) throws UnknownResourceException, BadUsageException {

        ResourceFunction resourceFunction = this.find(id);
        resourceFunctionPatch.setId(id);

        //Create an object mapper
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.convertValue(resourceFunctionPatch,JsonNode.class);

        BeanUtils.patch(resourceFunction, resourceFunctionPatch, jsonNode);
                
        this.edit(resourceFunction);

        return resourceFunction;

    } 

    // Validate mandatory fields and data types during entity creation
}
