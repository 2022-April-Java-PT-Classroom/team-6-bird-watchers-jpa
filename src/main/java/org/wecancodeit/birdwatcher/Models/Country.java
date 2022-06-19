package org.wecancodeit.birdwatcher.Models;


import javax.persistence.*;
import java.util.Collection;

@Entity
public class Country {

    @Id
    @GeneratedValue
    private Long id;
    private String name;



    public Country(){

    }

    public Country(String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }


}
