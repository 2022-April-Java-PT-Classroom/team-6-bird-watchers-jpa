package org.wecancodeit.birdwatcher.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Bird {
    @Id@GeneratedValue
    private Long id;
    private String birdName;
    private String birdType;
    private String birdOrder;



    protected Bird(){

    }

    public Bird(String birdName, String birdType, String birdOrder) {
        this.birdName = birdName;
        this.birdType = birdType;
        this.birdOrder = birdOrder;
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

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + birdName + '\'' +
                ", birdType='" + birdType + '\'' +
                ", birdOrder='" + birdOrder + '\'' +
                '}';
    }
}
