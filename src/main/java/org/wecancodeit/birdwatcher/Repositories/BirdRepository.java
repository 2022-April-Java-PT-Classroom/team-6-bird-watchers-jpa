package org.wecancodeit.birdwatcher.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.birdwatcher.Models.Bird;

import java.util.Collection;
import java.util.List;


public interface BirdRepository extends CrudRepository<Bird, Long>  {

    List<Bird> findByBirdName(String name);
    List<Bird> findByBirdType(String type);
    List<Bird> findByBirdOrder(String order);

    Bird findById(long id);
}
