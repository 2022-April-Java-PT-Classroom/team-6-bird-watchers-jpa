package org.wecancodeit.birdwatcher.Repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.birdwatcher.Models.Tour;

@Repository
public interface TourRepository extends CrudRepository<Tour, Long> {


}
