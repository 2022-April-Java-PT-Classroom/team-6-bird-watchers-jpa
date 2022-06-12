package org.wecancodeit.birdwatcher.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.birdwatcher.Models.Country;

public interface CountryRepository extends CrudRepository<Country, Long> {
}