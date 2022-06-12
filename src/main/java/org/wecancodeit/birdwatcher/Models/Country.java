package org.wecancodeit.birdwatcher.Models;


import javax.persistence.*;
import java.util.Collection;

@Entity
public class Country {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @ManyToMany
    private Collection<Bird> birds;
    @OneToOne
    private Collection<Region> regions;
    @ManyToMany(mappedBy = "birds")
    private Collection<Habitat> habitats;

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

    public Collection<Bird> getBirds() {
        return birds;
    }

    public Collection<Region> getRegions() {
        return regions;
    }
}
