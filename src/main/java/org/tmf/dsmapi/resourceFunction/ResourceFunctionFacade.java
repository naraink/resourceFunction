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

    // Validate mandatory fields and data types during entity creation
}
