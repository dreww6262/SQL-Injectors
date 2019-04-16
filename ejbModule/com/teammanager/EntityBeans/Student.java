package com.teammanager.EntityBeans;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Student
 */
@Stateless
@LocalBean
public class Student {
    private String name;
    private String password;
    // primary key and foreign key for profile
    private String username;


    /**
     * Returns the name of the student
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }


    /**
     * Sets the name of the student
     * 
     * @param name
     *            the name to set
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Returns the password of the student
     * 
     * @return the password
     */
    public String getPassword() {
        return password;
    }


    /**
     * Sets the Password of the student
     * 
     * @param password
     *            the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }


    /**
     * Gets the username of the student
     * 
     * @return the username
     */
    public String getUsername() {
        return username;
    }


    /**
     * Sets the username of the student
     * 
     * @param username
     *            the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }


    /**
     * constructor for a new Student object
     * @param name
     * @param username
     * @param password
     */
    public Student(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }
}
