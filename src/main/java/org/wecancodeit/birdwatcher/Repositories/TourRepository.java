package org.wecancodeit.birdwatcher.Repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.birdwatcher.Models.Tour;

import java.util.List;

@Repository
public interface TourRepository extends CrudRepository<Tour, Long> {

    List<Tour> findByTourName(String tourName);
    List<Tour> findByTourDescription(String tourDescription);
    List<Tour> findByTourCountry(String tourCountry);
    List<Tour> findByTourRegion(String tourRegion);
    List<Tour> findByTourHabitat(String tourHabitat);
    List<Tour> findByTourBirds(String tourBirds);

    Tour findById(long id);

}
