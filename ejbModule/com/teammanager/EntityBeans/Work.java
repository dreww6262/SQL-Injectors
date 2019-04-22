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
 * Session Bean implementation class Work
 */
@Entity
@Table(name = "Work")
@XmlRootElement

@NamedQueries ( {
    @NamedQuery(name = "Work.findByWork_id", query = "SELECT u FROM Work u WHERE u.work_id = :work_id")
})
public class Work implements Serializable{
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
    @Size(min = 1, max = 64)
    @Column(name = "fileLocation")
    private String fileLocation;
    // primary key
    @Id
    @NotNull
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "work_id")
    private String work_id;
    //foreign key
    @JoinColumn(name = "assignment_id", referencedColumnName = "assignment_id")
    @OneToOne
    private String assignment_id;


    /**
     * Constructor for the work object. Takes name, file location and work_id
     * 
     * @param name
     * @param fileLocation
     * @param work_id
     * @param assignment_id
     */
    public Work(String name, String fileLocation, String work_id, String assignment_id) {
        setName(name);
        setFileLocation(fileLocation);
        setWork_id(work_id);
        setAssignment_id(assignment_id);
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
     * @return the fileLocation
     */
    public String getFileLocation() {
        return fileLocation;
    }


    /**
     * @param fileLocation
     *            the fileLocation to set
     */
    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
    }


    /**
     * @return the work_id
     */
    public String getWork_id() {
        return work_id;
    }


    /**
     * private because it is a key
     * @param work_id
     *            the work_id to set
     */
    private void setWork_id(String work_id) {
        this.work_id = work_id;
    }


    /**
     * @return the assignment_id
     */
    public String getAssignment_id() {
        return assignment_id;
    }


    /**
     * private because it is a key
     * @param assignment_id the assignment_id to set
     */
    private void setAssignment_id(String assignment_id) {
        this.assignment_id = assignment_id;
    }
}
