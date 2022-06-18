package org.wecancodeit.birdwatcher.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tour {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Tour(String name, String description) {

    }
}
