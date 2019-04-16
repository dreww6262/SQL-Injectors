package com.teammanager.EntityBeans;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Class
 */
@Stateless
@LocalBean
public class Class {

    // primary key
    private String access_code;
    private String name;
    // foreign key
    private String teacher_id;


    /**
     * Constructor for the Class class. Takes access code, name and teacher id.
     * 
     * @param access_code
     * @param name
     * @param teacher_id
     */
    public Class(String access_code, String name, String teacher_id) {
        setAccess_code(access_code);
        setName(name);
        setTeacher_id(teacher_id);
    }


    /**
     * @return the access_code
     */
    public String getAccess_code() {
        return access_code;
    }


    /**
     * private because this is a key
     * @param access_code the access_code to set
     */
    private void setAccess_code(String access_code) {
        this.access_code = access_code;
    }


    /**
     * @return the name
     */
    public String getName() {
        return name;
    }


    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * @return the teacher_id
     */
    public String getTeacher_id() {
        return teacher_id;
    }


    /**
     * private because it is a key
     * @param teacher_id the teacher_id to set
     */
    private void setTeacher_id(String teacher_id) {
        this.teacher_id = teacher_id;
    }
}
