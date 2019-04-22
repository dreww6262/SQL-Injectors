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
 * Session Bean implementation class Student
 */
@Entity
@Table(name = "Student")
@XmlRootElement

@NamedQueries ( {
    @NamedQuery(name = "Student.findByStudent_uname", query = "SELECT u FROM Student u WHERE u.username = :username")
})
public class Student implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
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
    @Id
    @NotNull
    @Basic(optional = false)
    @Size(min = 5, max = 15)
    @Column(name = "username")
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @OneToOne
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
