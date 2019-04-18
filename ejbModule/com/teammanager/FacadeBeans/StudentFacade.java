package com.teammanager.FacadeBeans;

import com.teammanager.EntityBeans.Student;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class StudentFacade
 */
@Stateless
public class StudentFacade extends AbstractFacade<Student> {

    /**
     * Default constructor.
     */
    public StudentFacade() {
        super(Student.class);
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
