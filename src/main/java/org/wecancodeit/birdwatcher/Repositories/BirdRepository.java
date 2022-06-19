package org.wecancodeit.birdwatcher.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.birdwatcher.Models.Bird;

import java.util.Collection;
import java.util.List;

@Repository
public interface BirdRepository extends CrudRepository<Bird,Long>  {



}
