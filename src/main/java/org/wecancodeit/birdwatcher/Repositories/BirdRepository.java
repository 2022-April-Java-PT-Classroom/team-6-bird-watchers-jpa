package org.wecancodeit.birdwatcher.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.birdwatcher.Models.Bird;
import org.wecancodeit.birdwatcher.Models.Tour;

import java.util.List;

@Repository
public interface BirdRepository extends CrudRepository<Bird, Long> {

    Bird findByBirdName(String birdName);

    List<Bird> findByBirdType(String birdType);

    List<Bird> findByBirdOrder(String birdOrder);

    List<Tour> findByBirdTours(String birdTours);

    Bird findById(long id);
}
