package com.harry.mistbeerservice.web.mappers;

import com.harry.mistbeerservice.domain.Beer;
import com.harry.mistbeerservice.web.model.v2.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
