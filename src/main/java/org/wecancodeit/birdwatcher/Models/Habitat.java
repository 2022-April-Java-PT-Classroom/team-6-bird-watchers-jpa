package org.wecancodeit.birdwatcher.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
@Entity
public class Habitat {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public Habitat(){

    }

    public Habitat(String name) {
        this.id = id;
        this.name = name;
    }

}
