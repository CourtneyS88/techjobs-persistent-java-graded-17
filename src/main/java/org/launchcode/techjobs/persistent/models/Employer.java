package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {


     // field not being blank

    @NotBlank(message = "Location is required.")
     // taking care of length of the string defined
    @Size(min = 2, max = 250, message = " job location must be  2-250 characters long")

// Added location field
    private String location;

    // Adding private property jobs of type List<jobs>
    @OneToMany
   @JoinColumn(name="employer_id")

    private  List<Job> jobs=new ArrayList<>();

    public List<Job> getJobs() {
        return jobs;
    }

    // empty constructor
    public Employer() {}

 //  public accessors
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}
