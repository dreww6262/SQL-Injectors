package com.teammanager.EntityBeans;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Assignment
 */
@Stateless
@LocalBean
public class Assignment {

  //primary key
    private String assignment_id;
    private String description;
    private String name;
    // foreign key
    private String class_id;


    /**
     * Constructor for the assignment class. Takes in ID, description and name
     * fields.
     * 
     * @param assignment_id
     * @param description
     * @param name
     * @param class_id
     */
    public Assignment(
        String assignment_id,
        String description,
        String name,
        String class_id) {
        setAssignment_id(assignment_id);
        setDescription(description);
        setName(name);
        setClass_id(class_id);
    }


    /**
     * @return the assignment_id
     */
    public String getAssignment_id() {
        return assignment_id;
    }


    /**
     * private because this is a key
     * @param assignment_id
     *            the assignment_id to set
     */
    private void setAssignment_id(String assignment_id) {
        this.assignment_id = assignment_id;
    }


    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }


    /**
     * @param description
     *            the description to set
     */
    public void setDescription(String description) {
        this.description = description;
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
     * @return the class_id
     */
    public String getClass_id() {
        return class_id;
    }


    /**
     * private because this is a key
     * @param class_id
     *            the class_id to set
     */
    private void setClass_id(String class_id) {
        this.class_id = class_id;
    }

}
