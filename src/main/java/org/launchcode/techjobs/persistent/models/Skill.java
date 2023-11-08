package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;


@Entity
public class Skill extends AbstractEntity {


    // taking care of length of the string defined

    @Size(min = 2, max = 250, message = "skill description must be 2-250 characters long")
            public String description;


@ManyToMany(mappedBy="skills")
private List<Job> jobs=new ArrayList<>();

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
// empty constructor

    public Skill(){}

    //  public accessors
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
