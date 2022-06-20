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
    private String tourName;
    private String tourDescription;
    @ManyToOne
    private Country tourCountry;
    @ManyToOne
    private Region tourRegion;
    @ManyToOne
    private Habitat tourHabitat;
    @ManyToMany
    private Collection<Bird> tourBirds;


    public Long getId() {
        return id;
    }

    public String getTourName() {
        return tourName;
    }

    public String getTourDescription() {
        return tourDescription;
    }

    public Collection<Bird> getTourBirds() {
        return tourBirds;
    }

    public Country getTourCountry() {
        return tourCountry;
    }

    public Habitat getTourHabitat() {
        return tourHabitat;
    }

    public Region getTourRegion() {
        return tourRegion;
    }

    public Tour() {
    }

    public Tour(String tourName, String tourDescription, Country tourCountry, Region tourRegion, Habitat tourHabitat, Bird... birds) {
        this.tourName = tourName;
        this.tourDescription = tourDescription;
        this.tourCountry = tourCountry;
        this.tourRegion = tourRegion;
        this.tourHabitat = tourHabitat;
        this.tourBirds = new ArrayList<>(Arrays.asList(birds));
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Tour tour = (Tour) o;
//        return Objects.equals(id, tour.id);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//
//    }
}
