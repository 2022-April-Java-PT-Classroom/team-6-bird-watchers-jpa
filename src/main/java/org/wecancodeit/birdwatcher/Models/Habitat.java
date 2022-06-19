package org.wecancodeit.birdwatcher.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Habitat {
    @Id
    @GeneratedValue
    private Long id;
    private String habitatName;

    public Long getId(){
        return id;
    }

    public String getHabitatName(){
        return habitatName;
    }

    public Habitat(){

    }

    public Habitat(String habitatName) {
        this.id = id;
        this.habitatName = habitatName;
    }

}
