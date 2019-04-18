package com.teammanager.FacadeBeans;

import com.teammanager.EntityBeans.Assignment;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class AssignmentFacade
 */
@Stateless
public class AssignmentFacade extends AbstractFacade<Assignment> {

    /**
     * Default constructor.
     */
    public AssignmentFacade() {
        super(Assignment.class);
        // TODO Auto-generated constructor stub
    }

    @PersistenceContext(unitName = "SQL-Injectors EJBPU")
    private EntityManager em;


    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    /*
     * To do: Get Assignments by identification... Uses SQL querys
     * 
     * 
     * 
     */

}
