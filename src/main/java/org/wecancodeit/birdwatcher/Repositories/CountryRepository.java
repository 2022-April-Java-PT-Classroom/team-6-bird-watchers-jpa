package org.wecancodeit.birdwatcher.Repositories;


import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.birdwatcher.Models.Country;

import java.util.List;

public interface CountryRepository extends CrudRepository<Country, Long> {

    List<Country> findByCountry(String Country);

    Country findById(long id);
}