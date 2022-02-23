package com.harry.mistbeerservice.web.controller;

import com.harry.mistbeerservice.service.BeerService;
import com.harry.mistbeerservice.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService){
        this.beerService = beerService;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId){
        //todo impl
        return new ResponseEntity<BeerDto>(BeerDto.builder().id(UUID.randomUUID()).build(), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity handlePost(@RequestBody BeerDto beerDto){
        BeerDto savedBeer = beerService.saveNewBeer(beerDto);
        HttpHeaders headers = new HttpHeaders();
        //TODO - add url hostname
        headers.add("location","/api/v1/beer"+savedBeer.getId().toString());
        return new ResponseEntity(headers,HttpStatus.OK);

    }
    @PutMapping("/{beerId}")
    public ResponseEntity handleUpdate(@PathVariable("beerId") UUID beerId,@RequestBody  BeerDto beerDto){
        beerService.updateBeer(beerId, beerDto);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handleDelete(@PathVariable("beerId") UUID beerId){
        log.debug("deleting a beer object...");
        beerService.deleteById(beerId);
    }
}
