package com.teammanager.EntityBeans;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class StudentProfile
 */
@Stateless
@LocalBean
public class StudentProfile {
    private String name;
    // primary key and foreign key for student
    private String username;
    private double avgGrade;


    /**
     * Constructor for the student profile
     * 
     * @param name
     *            is the name of the student
     * @param username
     *            is the username of the student
     */
    public StudentProfile(String name, String username) {
        setName(name);
        setUsername(username);
        setAvgGrade(0);
    }


    /**
     * calculate average grade
     * 
     * @param newGrade
     *            the next assignment grade
     */
    public void calculateGrade() {
        // fixme
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
     * @return the username
     */
    public String getUsername() {
        return username;
    }


    /**
     * private because it is a username
     * @param username the username to set
     */
    private void setUsername(String username) {
        this.username = username;
    }


    /**
     * @return the avgGrade
     */
    public double getAvgGrade() {
        return avgGrade;
    }


    /**
     * private for security reasons
     * @param avgGrade the avgGrade to set
     */
    private void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }
}
