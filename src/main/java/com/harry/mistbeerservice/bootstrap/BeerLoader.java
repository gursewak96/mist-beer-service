package com.harry.mistbeerservice.bootstrap;

import com.harry.mistbeerservice.domain.Beer;
import com.harry.mistbeerservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository){
        this.beerRepository = beerRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects(){
        if(beerRepository.count() == 0){
            beerRepository.save(Beer.builder()
                    .beerName("Mango Bob")
                    .beerStyle("IPA")
                    .quantityToBrew(200)
                    .minOnHand(12)
                    .price(new BigDecimal("12.96"))
                    .upc(337020928348L)
                    .build());
            beerRepository.save(Beer.builder()
                    .beerName("Galaxy Bob")
                    .beerStyle("PALE_ALE")
                    .quantityToBrew(200)
                    .minOnHand(12)
                    .price(new BigDecimal("11.96"))
                    .upc(337020910348L)
                    .build());
        }

    }
}