package org.wecancodeit.birdwatcher;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.birdwatcher.Models.*;
import org.wecancodeit.birdwatcher.Repositories.*;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private TourRepository tourRepo;

    @Resource
    private BirdRepository birdRepo;

    @Resource
    private CountryRepository countryRepo;

    @Resource
    private RegionRepository regionRepo;

    @Resource
    private HabitatRepository habitatRepo;

    @Override
    public void run(String... args) throws Exception {
        /*
        Please rename tours when info is added.
        Arguments to add to tour:
        Name (one word please), Description
        Birds should be linked to tour through models
        (see module example for campus + books)
        I think the country, region, and habitat will
        work similarly but worse case scenario we can
        add them as string arguments if we can't get those
        working
        */
        Tour tour1 = new Tour("Name", "Description");
        Tour tour2 = new Tour("Name", "Description");
        Tour tour3 = new Tour("Name", "Description");

        /*
        What is bird order?? We don't need that.
        Not sure what bird type is, but if there's a reason to
        have that, then birds should have a name, description,
        and bird type.
        We'll want more birds than three.
        */
        Bird bird1 = new Bird("Name", "Type", "Description");
        Bird bird2 = new Bird("Name", "Type", "Description");
        Bird bird3 = new Bird("Name", "Type", "Description");
        
        Country colombia = new Country("Colombia");
        Country brazil = new Country("Brazil");

        /*
        Don't know what regions or habitats we'll have,
        so just leaving the below as such. We can add
        descriptions if we want.
         */

        Region region1 = new Region("Name");

        Habitat habitat1 = new Habitat("Name");
    }

}
