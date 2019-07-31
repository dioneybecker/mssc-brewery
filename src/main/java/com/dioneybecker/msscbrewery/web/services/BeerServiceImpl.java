package com.dioneybecker.msscbrewery.web.services;

import java.util.UUID;

import com.dioneybecker.msscbrewery.web.model.BeerDto;

import org.springframework.stereotype.Service;

/**
 * BeerServiceImpl
 */
@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID()).name("Galaxy Cat").beerStyle("Pale Ale").build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beer) {
        return BeerDto.builder().id(UUID.randomUUID()).name(beer.getName()).beerStyle(beer.getBeerStyle())
                .upc(beer.getUpc()).build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beer) {
        // not implemented
    }

    @Override
    public void deleteById(UUID beerId) {

    }

}