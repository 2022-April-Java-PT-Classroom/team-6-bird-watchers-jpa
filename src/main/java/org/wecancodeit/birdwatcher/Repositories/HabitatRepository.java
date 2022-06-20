package org.wecancodeit.birdwatcher.Repositories;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;
import org.wecancodeit.birdwatcher.Models.Habitat;


import java.util.List;

@Repository
public interface HabitatRepository extends CrudRepository<Habitat, Long> {

    Habitat findByHabitatName(String habitatName);

    Habitat findById(long id);

}
