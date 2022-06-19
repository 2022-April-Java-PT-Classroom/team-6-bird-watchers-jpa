package org.wecancodeit.birdwatcher.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bird {
    @Id@GeneratedValue
    private Long id;
    private String name;
    private String birdType;
    private String birdOrder;



    protected Bird(){

    }

    public Bird( String name, String birdType, String birdOrder) {
        this.name = name;
        this.birdType = birdType;
        this.birdOrder = birdOrder;
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
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
                "name='" + name + '\'' +
                ", birdType='" + birdType + '\'' +
                ", birdOrder='" + birdOrder + '\'' +
                '}';
    }
}
