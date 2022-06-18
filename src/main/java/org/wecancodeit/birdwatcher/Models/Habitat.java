package org.wecancodeit.birdwatcher.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
@Entity
public class Habitat {
    @Id
    @GeneratedValue
    private Long id;
    private String name;


    public Habitat(String name) {

    }
}
