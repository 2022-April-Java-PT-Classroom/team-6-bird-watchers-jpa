package org.wecancodeit.birdwatcher.Models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@Entity
public class Bird {
    @Id
    @GeneratedValue
    private Long id;
    private String birdName;
    private String birdType;
    private String birdOrder;
    @ManyToMany
    private Collection<Tour> birdTours;

    protected Bird() {

    }

    public Bird(String birdName, String birdType, String birdOrder, Tour... tours) {
        this.birdName = birdName;
        this.birdType = birdType;
        this.birdOrder = birdOrder;
        this.birdTours = new ArrayList<>(Arrays.asList(tours));
    }

    public Long getId() {
        return id;
    }

    public String getBirdName() {
        return birdName;
    }

    public String getBirdType() {
        return birdType;
    }

    public String getBirdOrder() {
        return birdOrder;
    }

    public Collection<Tour> getBirdTours() {
        return birdTours;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + birdName + '\'' +
                ", birdType='" + birdType + '\'' +
                ", birdOrder='" + birdOrder + '\'' +
                '}';
    }
}
