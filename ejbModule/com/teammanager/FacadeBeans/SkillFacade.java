package com.teammanager.FacadeBeans;

import com.teammanager.EntityBeans.Skill;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class SkillFacade
 */
@Stateless
public class SkillFacade extends AbstractFacade<Skill> {

    /**
     * Default constructor.
     */
    public SkillFacade() {
        super(Skill.class);
        // TODO Auto-generated constructor stub
    }

    @PersistenceContext(unitName = "SQL-Injectors EJBPU")
    private EntityManager em;


    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    /*
     * To do: Get Skill by identification... Uses SQL querys
     * 
     * 
     * 
     */

}
