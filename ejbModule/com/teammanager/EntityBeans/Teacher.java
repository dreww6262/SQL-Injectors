package com.teammanager.EntityBeans;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
/**
 * Session Bean implementation class Assignment
 */
@Entity
@Table(name = "Assignment")
@XmlRootElement

@NamedQueries ( {
    @NamedQuery(name = "Assignment.findByAssignment_id", query = "SELECT u FROM Assignment u WHERE u.assignment_id = :assignment_id")
})
public class Teacher implements Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    //primary key
    @Id
    @NotNull
    @Basic(optional = false)
    @Size(min = 5, max = 15)
    @Column(name = "username")
    private String username;
    @NotNull
    @Basic(optional = false)
    @Size(min = 1, max = 32)
    @Column(name = "name")
    private String name;
    @NotNull
    @Basic(optional = false)
    @Size(min = 8, max = 16)
    @Column(name = "password")
    private String password;


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
