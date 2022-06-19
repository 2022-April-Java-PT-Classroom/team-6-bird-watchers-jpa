package org.wecancodeit.birdwatcher.Repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.birdwatcher.Models.Country;

import java.util.List;
@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {

    List<Country> findByCountryName(String country);

    Country findById(long id);

}