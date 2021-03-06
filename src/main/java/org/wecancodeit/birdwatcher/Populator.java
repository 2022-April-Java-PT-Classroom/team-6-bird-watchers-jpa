package org.wecancodeit.birdwatcher;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.birdwatcher.Models.*;
import org.wecancodeit.birdwatcher.Repositories.*;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private TourRepository tourRepository;

    @Resource
    private BirdRepository birdRepository;

    @Resource
    private CountryRepository countryRepository;

    @Resource
    private RegionRepository regionRepository;

    @Resource
    private HabitatRepository habitatRepository;

    @Override
    public void run(String... args) throws Exception {

        Country colombia = new Country("Colombia");
        countryRepository.save(colombia);
        Country brazil = new Country("Brazil");
        countryRepository.save(brazil);


        Region toucantis = new Region("Toucantis");
        regionRepository.save(toucantis);
        Region amazonas = new Region("Amazonas");
        regionRepository.save(amazonas);
        Region orinoquia = new Region("Orinoquia");
        regionRepository.save(orinoquia);
        Region amazonia = new Region("Amazonia");
        regionRepository.save(amazonia);

        Habitat canopy = new Habitat("Canopy");
        habitatRepository.save(canopy);
        Habitat rainforest = new Habitat("Rainforest");
        habitatRepository.save(rainforest);
        Habitat river = new Habitat("River");
        habitatRepository.save(river);

        Bird toucan = new Bird("Toucan", "Frugivorous", "Piciformes");
        birdRepository.save(toucan);
        Bird macaw = new Bird("Macaw", "Omnivorous", "Psittaciformes");
        birdRepository.save(macaw);
        Bird harpyEagle = new Bird("Harpy Eagle", "Carnivorous", "Accipitriformes");
        birdRepository.save(harpyEagle);
        Bird kingVulture = new Bird("King Vulture", "Carrion-eater", "Acciptitriformes");
        birdRepository.save(kingVulture);
        Bird hoatzin = new Bird("Hoatzin", "Folivore", "Opisthocomiformes");
        birdRepository.save(hoatzin);
        birdRepository.findAll();

        Tour toucantisRiverTour = new Tour("Toucantis River Tour", "Paddle down the Amazon River to observe the birds feeding and nesting.", brazil, toucantis, river, toucan, macaw);
        tourRepository.save(toucantisRiverTour);
        Tour amazonasRainforestTour = new Tour("Amazonas Rainforest Tour", "Explore the rainforest while taking in the sights and sounds.", brazil, amazonas, rainforest, harpyEagle, kingVulture, hoatzin);
        tourRepository.save(amazonasRainforestTour);
        Tour amazonasSkywalkTour = new Tour("Amazonas Skywalk Tour", "Walk among the treetops and observe the birds nesting and flying about.", brazil, amazonas, canopy, kingVulture);
        tourRepository.save(amazonasSkywalkTour);
        Tour orinoquiaRiverTour = new Tour("Orinoquia River Tour", "Paddle down the Orinoco River and see the birds feeding and nesting.", colombia, orinoquia, river, macaw, toucan);
        tourRepository.save(orinoquiaRiverTour);
        Tour amazoniaRainforestTour = new Tour("Amazonia Rainforest Tour", "Walk though a less-traveled part of the rainforest while taking in the sights and sounds.", colombia, amazonia, rainforest, hoatzin, kingVulture, harpyEagle);
        tourRepository.save(amazoniaRainforestTour);
        tourRepository.findAll();

    }

}
