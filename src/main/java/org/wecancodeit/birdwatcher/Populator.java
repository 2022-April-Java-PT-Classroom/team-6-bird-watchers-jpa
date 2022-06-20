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
        Country brazil = new Country("Brazil");
        countryRepository.save(brazil);
        countryRepository.save(colombia);

        Region toucantis = new Region("Toucantis");
        Region amazonas = new Region("Amazonas");
        Region orinoquia = new Region("Orinoquia");
        Region amazonia = new Region("Amazonia");
        regionRepository.save(toucantis);
        regionRepository.save(amazonas);
        regionRepository.save(orinoquia);
        regionRepository.save(amazonia);

        Habitat canopy = new Habitat("Canopy");
        Habitat rainforest = new Habitat("Rainforest");
        Habitat river = new Habitat("River");
        habitatRepository.save(canopy);
        habitatRepository.save(rainforest);
        habitatRepository.save(river);

        Bird toucan = new Bird("Toucan", "frugivorous", "Piciformes");
        Bird macaw = new Bird("Macaw", "omnivorous", "Psittaciformes");
        Bird harpyEagle = new Bird("Harpy Eagle", "carnivorous", "Accipitriformes");
        Bird kingVulture = new Bird("King Vulture", "carrion-eater", "Acciptitriformes");
        Bird hoatzin = new Bird("Hoatzin", "folivore", "Opisthocomiformes");
        birdRepository.save(toucan);
        birdRepository.save(macaw);
        birdRepository.save(harpyEagle);
        birdRepository.save(kingVulture);
        birdRepository.save(hoatzin);

        Tour toucantisRiverTour = new Tour("Toucantis River Tour", "Paddle down the Amazon River to observe the birds feeding and nesting", brazil, toucantis, river, toucan);
        Tour amazonasRainforestTour = new Tour("Amazonas Rainforest Tour", "Expolore the rainforest taking in the sights and sounds", brazil, amazonas, rainforest, harpyEagle);
        Tour amazonasSkywalkTour = new Tour("Amazonas Skywalk Tour", "Walk among the treetops and observe the birds nesting and flying about", brazil, amazonas, canopy, kingVulture);
        Tour orinoquiaRiverTour = new Tour("Orinoquia River Tour", "Paddle down the Orinoco River and see the birds feeding and nesting", colombia, orinoquia, river, macaw);
        Tour amazoniaRainforestTour = new Tour("Amazonia Rainforest Tour", "Walk though the rainforest taking in the sights and sounds", colombia, amazonia, rainforest, hoatzin);
        tourRepository.save(toucantisRiverTour);
        tourRepository.save(amazonasRainforestTour);
        tourRepository.save(amazonasSkywalkTour);
        tourRepository.save(orinoquiaRiverTour);
        tourRepository.save(amazoniaRainforestTour);

    }

}
