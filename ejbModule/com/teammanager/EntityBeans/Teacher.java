package com.teammanager.EntityBeans;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Teacher
 */
@Stateless
@LocalBean
public class Teacher {
    //primary key
    private String username;
    private String password;
    private String name;


    /**
     * Constructor for teacher object. Takes in username, password and name
     * fields
     * 
     * @param username
     * @param password
     * @param name
     */
    public Teacher(String username, String password, String name) {
        setUsername(username);
        setPassword(password);
        setName(name);
    }


    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }


    /**
     * @param username the username to set
     */
    private void setUsername(String username) {
        this.username = username;
    }


    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }


    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
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
}
