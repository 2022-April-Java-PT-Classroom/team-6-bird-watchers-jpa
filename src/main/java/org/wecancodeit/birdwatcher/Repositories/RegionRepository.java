package org.wecancodeit.birdwatcher.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.birdwatcher.Models.Region;

import java.util.List;

public interface RegionRepository extends CrudRepository<Region, Long> {

    List<Region> findByName(String name);

    Region findById(long id);
}
