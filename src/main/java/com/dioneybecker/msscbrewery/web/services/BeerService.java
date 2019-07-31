package com.dioneybecker.msscbrewery.web.services;

import java.util.UUID;

import com.dioneybecker.msscbrewery.web.model.BeerDto;

/**
 * BeerService
 */
public interface BeerService {

	BeerDto getBeerById(UUID beerId);

	BeerDto saveNewBeer(BeerDto beer);

	void updateBeer(UUID beerId, BeerDto beer);

	void deleteById(UUID beerId);
    
}