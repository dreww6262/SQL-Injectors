package com.teammanager.EntityBeans;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Skill
 */
@Stateless
@LocalBean
public class Skill {

    private String name;
    private String skill_id;
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
