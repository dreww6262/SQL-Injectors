package com.teammanager.EntityBeans;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
public class Assignment implements Serializable{
    private static final long serialVersionUID = 1L;
  //primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "assignment_id")
    private String assignment_id;
    
    @Basic(optional = true)
    @Column(name = "description")
    private String description;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "name")
    private String name;
    // foreign key
    @JoinColumn(name = "class_id", referencedColumnName = "class_id")
    @OneToOne
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
