package org.wecancodeit.birdwatcher.Repositories;

import org.springframework.data.repository.CrudRepository;

import org.wecancodeit.birdwatcher.Models.Habitat;

import java.util.List;

public interface HabitatRepository extends CrudRepository<Habitat, Long> {

    List<Habitat> findByName(String name);

    Habitat findById(long id);
}
