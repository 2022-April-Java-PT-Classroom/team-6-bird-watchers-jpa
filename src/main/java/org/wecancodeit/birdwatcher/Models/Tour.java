package org.wecancodeit.birdwatcher.Models;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Tour {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    @ManyToMany
    private Collection<Bird> birds;
    @ManyToOne
    private Collection<Country> countries;
    @ManyToOne
    private Collection<Habitat> habitats;
    @ManyToOne
    private Collection<Region> regions;

    // not solid about the relationship configurations
    // Example: many tours happen in Brazil, but each tour takes place within only one country

    // also could be a nested relationship such as region>country or country>region,
    // but I think we need all of these in this model for search functionality


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Collection<Bird> getBirds(){
        return birds;
    }

    public Collection<Country> getCountries() {
        return countries;
    }

    public Collection<Habitat> getHabitats() {
        return habitats;
    }

    public Collection<Region> getRegions() {
        return regions;
    }

    public Tour(){}

    public Tour(String name, String description){
        this.name = name;
        this.description = description;
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
