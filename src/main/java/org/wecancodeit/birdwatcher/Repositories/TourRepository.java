package org.wecancodeit.birdwatcher.Repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.birdwatcher.Models.Tour;

import java.util.List;

@Repository
public interface TourRepository extends CrudRepository<Tour, Long> {

    List<Tour> findByName(String name);
    List<Tour> findByDescription(String description);
    List<Tour> findByCountry(String country);
    List<Tour> findByRegion(String region);
    List<Tour> findByHabitat(String habitat);
    List<Tour> findByBirds(String birds);

    Tour findById(long id);

}
