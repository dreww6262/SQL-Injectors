package com.teammanager.FacadeBeans;

import com.teammanager.EntityBeans.Work;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class WorkFacade
 */
@Stateless
public class WorkFacade extends AbstractFacade<Work> {

    /**
     * Default constructor.
     */
    public WorkFacade() {
        super(Work.class);
        // TODO Auto-generated constructor stub
    }

    @PersistenceContext(unitName = "SQL-Injectors EJBPU")
    private EntityManager em;


    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    /*
     * To do: Get Works by identification... Uses SQL querys
     * 
     * 
     * 
     */

}
