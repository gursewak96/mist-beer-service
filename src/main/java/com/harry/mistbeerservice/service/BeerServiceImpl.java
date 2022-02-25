package com.harry.mistbeerservice.service;



import com.harry.mistbeerservice.web.model.BeerDto;
import com.harry.mistbeerservice.web.model.BeerStyleEnum;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy cat")
                .beerStyle(BeerStyleEnum.STOUT)
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder().id(UUID.randomUUID()).beerName("Maria").build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //todo - beer need to update (impl)
    }

    @Override
    public void deleteById(UUID beerId) {

    }
}