package com.teammanager.EntityBeans;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
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
public class StudentProfile implements Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @NotNull
    @Basic(optional = false)
    @Size(min = 1, max = 32)
    @Column(name = "name")
    private String name;
    // primary key and foreign key for student
    @Id
    @NotNull
    @Basic(optional = false)
    @Size(min = 5, max = 15)
    @Column(name = "username")
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @OneToOne
    private String username;
    @Column(name = "avgGrade")
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
