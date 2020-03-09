package com.springframework.msscbeerservice.domain;

import com.springframework.msscbeerservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {
    /*
            DATA MEMBERS
     */
    private final BeerRepository beerRepository;

    /*
            CONSTRUCTOR
     */
    public BeerLoader(BeerRepository beerRepository) { this.beerRepository = beerRepository; }

    /*
            METHODS
     */
    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects(){
        if(beerRepository.count() == 0){
            beerRepository.save(Beer
                    .builder()
                    .beerName("Mango bobs")
                    .beerStyle("IPA")
                    .quantityToBrew(200)
                    .upc(33701000000001L)
                    .price(new BigDecimal("12.95"))
                    .build()
            );

            beerRepository.save(Beer
                    .builder()
                    .beerName("Galaxy Cat")
                    .beerStyle("PALE_ALE")
                    .quantityToBrew(200)
                    .upc(33701000000002L)
                    .price(new BigDecimal("11.95"))
                    .build()
            );
            //System.out.println("Loaded Beers " + beerRepository.count());
        }
    }
}
