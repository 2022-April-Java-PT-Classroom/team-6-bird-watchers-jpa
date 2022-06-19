package org.wecancodeit.birdwatcher.Models;


import javax.persistence.*;

@Entity
public class Country {

    @Id
    @GeneratedValue
    private Long id;
    private String countryName;



    public Country(){

    }

    public Country(String countryName) {
        this.id = id;
        this.countryName = countryName;
    }

    public Long getId() {
        return id;
    }

    public String getCountryName() {
        return countryName;
    }


}
