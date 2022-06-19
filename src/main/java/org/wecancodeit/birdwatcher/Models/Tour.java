package org.wecancodeit.birdwatcher.Models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tour {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    @ManyToOne
    private Country country;
    @ManyToOne
    private Region region;
    @ManyToOne
    private Habitat habitat;
    @ManyToMany
    private Collection<Bird> birds;


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Collection<Bird> getBirds() {
        return birds;
    }

    public Country getCountry() {
        return country;
    }

    public Habitat habitat() {
        return habitat;
    }

    public Region region() {
        return region;
    }

    public Tour() {
    }

    public Tour(String name, String description, Country country, Region region, Habitat habitat, Bird... birds) {
        this.name = name;
        this.description = description;
        this.country = country;
        this.region = region;
        this.habitat = habitat;
        this.birds = new ArrayList<>(Arrays.asList(birds));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tour tour = (Tour) o;
        return Objects.equals(id, tour.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);


    }
}
