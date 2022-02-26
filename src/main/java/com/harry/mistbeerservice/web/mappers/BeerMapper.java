package com.harry.mistbeerservice.web.mappers;


import com.harry.mistbeerservice.domain.Beer;
import com.harry.mistbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    Beer beerDtoToBeer(BeerDto beerDto);

    BeerDto beerToBeerDto(Beer beer);

}
