package org.wecancodeit.birdwatcher.Models;


import javax.persistence.*;
import java.util.Collection;


public class Country {

    @Id
    @GeneratedValue
    private Long id;
    private String name;



    public Country(){}

    public Country(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }


}
