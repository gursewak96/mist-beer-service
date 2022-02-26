package com.harry.mistbeerservice.web.model.v2;

import com.harry.mistbeerservice.web.model.BeerStyleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Null;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

    private UUID id;
    private String beerName;
    private BeerStyleEnum beerStyle;
    private Long upc;
    private OffsetDateTime createdDate;

    private OffsetDateTime lastModifiedDate;
}
