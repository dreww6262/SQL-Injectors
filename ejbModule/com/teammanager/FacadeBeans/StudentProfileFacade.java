package com.teammanager.FacadeBeans;

import com.teammanager.EntityBeans.StudentProfile;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class StudentProfileFacade
 */
@Stateless
public class StudentProfileFacade extends AbstractFacade<StudentProfile> {

    /**
     * Default constructor.
     */
    public StudentProfileFacade() {
        super(StudentProfile.class);
        // TODO Auto-generated constructor stub
    }

    @PersistenceContext(unitName = "SQL-Injectors EJBPU")
    private EntityManager em;


    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    /*
     * To do: Get StudentProfile by identification... Uses SQL querys
     * 
     * 
     * 
     */

}
