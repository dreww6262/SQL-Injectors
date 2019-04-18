package com.teammanager.FacadeBeans;

import com.teammanager.EntityBeans.Class;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class ClassFacade
 */
@Stateless
public class ClassFacade extends AbstractFacade<Class> {

    /**
     * Default constructor.
     */
    public ClassFacade() {
        super(Class.class);
        // TODO Auto-generated constructor stub
    }

    @PersistenceContext(unitName = "SQL-Injectors EJBPU")
    private EntityManager em;


    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    /*
     * To do: Get Classes by identification... Uses SQL querys
     * 
     * 
     * 
     */

}
