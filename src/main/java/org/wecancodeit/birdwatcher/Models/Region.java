package org.wecancodeit.birdwatcher.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Region {
    @Id
    @GeneratedValue
    private Long id;
    private String regionName;

    public Long getId() {
        return id;
    }

    public String getRegionName() {
        return regionName;
    }

    public Region() {

    }

    public Region(String regionName) {
        this.regionName = regionName;
    }
}
