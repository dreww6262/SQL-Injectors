package com.teammanager.EntityBeans;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Work
 */
@Stateless
@LocalBean
public class Work {
    private String name;
    private String fileLocation;
    // primary key
    private String work_id;
    //foreign key
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
