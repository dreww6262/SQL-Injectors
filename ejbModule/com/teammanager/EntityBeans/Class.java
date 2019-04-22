package com.teammanager.EntityBeans;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
/**
 * Session Bean implementation class Class
 */
@Entity
@Table(name = "Class")
@XmlRootElement

@NamedQueries ( {
    @NamedQuery(name = "Class.findByAccessCode", query = "SELECT u FROM Class u WHERE u.access_code = :access_code")
})
/**
 * Session Bean implementation class Class
 */
public class Class implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    // primary key
    @Id
    @Basic(optional = false)
    @Column(name = "access_code")
    private String access_code;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "name")
    private String name;
    // foreign key
    @JoinColumn(name = "teacher_id", referencedColumnName = "teacher_id")
    @ManyToOne
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
