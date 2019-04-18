package com.teammanager.FacadeBeans;

import com.teammanager.EntityBeans.Teacher;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class TeacherFacade
 */
@Stateless
public class TeacherFacade extends AbstractFacade<Teacher> {

    /**
     * Default constructor.
     */
    public TeacherFacade() {
        super(Teacher.class);
        // TODO Auto-generated constructor stub
    }

    @PersistenceContext(unitName = "SQL-Injectors EJBPU")
    private EntityManager em;


    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    /*
     * To do: Get Teachers by identification... Uses SQL querys
     * 
     * 
     * 
     */

}
