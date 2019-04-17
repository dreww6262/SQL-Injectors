package com.teammanager.EntityBeans;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
 * Session Bean implementation class Assignment
 */
@Entity
@Table(name = "Assignment")
@XmlRootElement

@NamedQueries ( {
    @NamedQuery(name = "Assignment.findByAssignment_id", query = "SELECT u FROM Assignment u WHERE u.assignment_id = :assignment_id")
})
public class Score implements Serializable{/**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Column(name = "grade")
    private double grade;
    @Column(name = "name")
    @Basic(optional = false)
    @Size(min = 1, max = 32)
    @NotNull
    private String name;
    //primary key
    @Column(name = "score_id")
    @Basic(optional = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String score_id;
    // foreign key
    @JoinColumn(name = "skill_id", referencedColumnName = "skill_id")
    @ManyToOne
    private String skill_id;


    /**
     * this is a constructor for the Score object. Takes grade, name and ID
     * fields
     * 
     * @param grade
     * @param name
     * @param score_id
     * @param skill_id
     */
    public Score(double grade, String name, String score_id, String skill_id) {
        setGrade(grade);
        setName(name);
        setScore_id(score_id);
        setSkill_id(skill_id);
    }


    /**
     * private because it is a key
     * sets score_id. This is private for security purposes
     * 
     * @param score_id2
     */
    private void setScore_id(String score_id) {
        this.score_id = score_id;
    }


    /**
     * @return the grade
     */
    public double getGrade() {
        return grade;
    }


    /**
     * @param grade
     *            the grade to set
     */
    public void setGrade(double grade) {
        this.grade = grade;
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
     * @return the score_id
     */
    public String getScore_id() {
        return score_id;
    }


    /**
     * @return the skill_id
     */
    public String getSkill_id() {
        return skill_id;
    }


    /**
     * private because it is a key
     * @param skill_id the skill_id to set
     */
    private void setSkill_id(String skill_id) {
        this.skill_id = skill_id;
    }
}
