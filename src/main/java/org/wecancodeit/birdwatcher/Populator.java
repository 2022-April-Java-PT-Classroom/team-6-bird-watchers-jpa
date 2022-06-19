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

        Country colombia = new Country("Colombia");
        Country brazil = new Country("Brazil");
        countryRepo.save(brazil);
        countryRepo.save(colombia);

        Region toucantis = new Region("Toucantis");
        Region amazonas = new Region("Amazonas");
        Region orinoquia = new Region("Orinoquia");
        Region amazonia = new Region("Amazonia");
        regionRepo.save(toucantis);
        regionRepo.save(amazonas);
        regionRepo.save(orinoquia);
        regionRepo.save(amazonia);

        Habitat canopy = new Habitat("Canopy");
        Habitat rainforest = new Habitat("Rainforest");
        Habitat river = new Habitat("River");
        habitatRepo.save(canopy);
        habitatRepo.save(rainforest);
        habitatRepo.save(river);

        Bird toucan = new Bird("Toucan", "frugivorous", "Piciformes");
        Bird macaw = new Bird("Macaw", "omnivorous", "Psittaciformes");
        Bird harpyEagle = new Bird("Harpy Eagle", "carnivorous", "Accipitriformes");
        Bird kingVulture = new Bird("King Vulture", "carrion-eater", "Acciptitriformes");
        Bird hoatzin = new Bird("Hoatzin", "folivore", "Opisthocomiformes");
        birdRepo.save(toucan);
        birdRepo.save(macaw);
        birdRepo.save(harpyEagle);
        birdRepo.save(kingVulture);
        birdRepo.save(hoatzin);

        Tour toucantisRiverTour = new Tour("Toucantis River Tour", "Paddle down the Amazon River to observe the birds feeding and nesting", brazil, toucantis, river, toucan);
        Tour amazonasRainforestTour = new Tour("Amazonas Rainforest Tour", "Expolore the rainforest taking in the sights and sounds", brazil, amazonas, rainforest, harpyEagle);
        Tour amazonasSkywalkTour = new Tour("Amazonas Skywalk Tour", "Walk among the treetops and observe the birds nesting and flying about", brazil, amazonas, canopy, kingVulture);
        Tour orinoquiaRiverTour = new Tour("Orinoquia River Tour", "Paddle down the Orinoco River and see the birds feeding and nesting", colombia, orinoquia, river, macaw);
        Tour amazoniaRainforestTour = new Tour("Amazonia Rainforest Tour", "Walk though the rainforest taking in the sights and sounds", colombia, amazonia, rainforest, hoatzin);
        tourRepo.save(toucantisRiverTour);
        tourRepo.save(amazonasRainforestTour);
        tourRepo.save(amazonasSkywalkTour);
        tourRepo.save(orinoquiaRiverTour);
        tourRepo.save(amazoniaRainforestTour);

    }

}
