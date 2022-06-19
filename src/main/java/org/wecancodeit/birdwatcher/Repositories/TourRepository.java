package org.wecancodeit.birdwatcher.Repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.birdwatcher.Models.Tour;

import java.util.List;

@Repository
public interface TourRepository extends CrudRepository<Tour, Long> {

    List<Tour> findByTourName(String name);
    List<Tour> findByTourDescription(String description);
    List<Tour> findByTourCountry(String country);
    List<Tour> findByTourRegion(String region);
    List<Tour> findByTourHabitat(String habitat);
    List<Tour> findByTourBirds(String birds);

    Tour findById(long id);

}
