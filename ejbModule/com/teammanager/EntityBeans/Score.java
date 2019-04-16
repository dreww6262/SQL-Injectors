package com.teammanager.EntityBeans;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Score
 */
@Stateless
@LocalBean
public class Score {
    private double grade;
    private String name;
    //primary key
    private String score_id;
    // foreign key
    private String skill_id;


    /**
     * this is a constructor for the Score object. Takes grade, name and ID
     * fields
     * 
     * @param grade
     * @param name
     * @param score_id
     * @param skill_id
     */
    public Score(double grade, String name, String score_id, String skill_id) {
        setGrade(grade);
        setName(name);
        setScore_id(score_id);
        setSkill_id(skill_id);
    }


    /**
     * private because it is a key
     * sets score_id. This is private for security purposes
     * 
     * @param score_id2
     */
    private void setScore_id(String score_id) {
        this.score_id = score_id;
    }


    /**
     * @return the grade
     */
    public double getGrade() {
        return grade;
    }


    /**
     * @param grade
     *            the grade to set
     */
    public void setGrade(double grade) {
        this.grade = grade;
    }


    /**
     * @return the name
     */
    public String getName() {
        return name;
    }


    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * @return the score_id
     */
    public String getScore_id() {
        return score_id;
    }


    /**
     * @return the skill_id
     */
    public String getSkill_id() {
        return skill_id;
    }


    /**
     * private because it is a key
     * @param skill_id the skill_id to set
     */
    private void setSkill_id(String skill_id) {
        this.skill_id = skill_id;
    }
}
