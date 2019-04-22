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
 * Session Bean implementation class Skill
 */
@Entity
@Table(name = "Skill")
@XmlRootElement

@NamedQueries ( {
    @NamedQuery(name = "Skill.findBySkill_id", query = "SELECT u FROM Skill u WHERE u.skill_id = :skill_id AND u.name = :name")
})
public class Skill implements Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @NotNull
    @Basic(optional = false)
    @Size(min = 1, max = 32)
    @Column(name = "name")
    private String name;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    private String skill_id;
    @JoinColumn(name = "profile_id", referencedColumnName = "profile_id")
    @ManyToOne
    private String profile_id;


    /**
     * @return the skill_id
     */
    public String getSkill_id() {
        return skill_id;
    }


    /**
     * private because it is a key
     * @param skill_id
     *            the skill_id to set
     */
    private void setSkill_id(String skill_id) {
        this.skill_id = skill_id;
    }


    /**
     * @return the profile_id
     */
    public String getProfile_id() {
        return profile_id;
    }


    /**
     * private because it is a key
     * @param profile_id
     *            the profile_id to set
     */
    private void setProfile_id(String profile_id) {
        this.profile_id = profile_id;
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
     * Constructor for Skill object
     * 
     * @param name
     * @param skill_id
     * @param profile_id
     */
    public Skill(String name, String skill_id, String profile_id) {
        setName(name);
        setSkill_id(skill_id);
        setProfile_id(profile_id);
    }

}
