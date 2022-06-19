package org.wecancodeit.birdwatcher.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.birdwatcher.Models.Region;

import java.util.List;
@Repository
public interface RegionRepository extends CrudRepository<Region, Long> {

    List<Region> findByRegionName(String name);

    Region findById(long id);
}
