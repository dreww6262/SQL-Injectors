package com.teammanager.FacadeBeans;

import com.teammanager.EntityBeans.Score;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class ScoreFacade
 */
@Stateless
public class ScoreFacade extends AbstractFacade<Score> {

    /**
     * Default constructor.
     */
    public ScoreFacade() {
        super(Score.class);
        // TODO Auto-generated constructor stub
    }

    @PersistenceContext(unitName = "SQL-Injectors EJBPU")
    private EntityManager em;


    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    /*
     * To do: Get Scores by identification... Uses SQL queries
     * 
     * 
     * 
     */

}
