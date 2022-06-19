package org.wecancodeit.birdwatcher.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Region {
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

    public Region(){

    }

    public Region(String name) {
        this.id = id;
        this.name = name;
    }
}
