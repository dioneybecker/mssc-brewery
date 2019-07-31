package com.dioneybecker.msscbrewery.web.services;

import java.util.UUID;

import com.dioneybecker.msscbrewery.web.model.CustomerDto;

import org.springframework.stereotype.Service;

/**
 * CustomerServiceImpl
 */
@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
            .id(UUID.randomUUID())
            .name("Dioney Becker")
            .build();
	}

    @Override
    public CustomerDto saveCustomer(CustomerDto customer) {
        return CustomerDto.builder()
        .id(UUID.randomUUID())
        .name(customer.getName())
        .build();
    }

    @Override
    public void updateCustomerById(UUID cusomerId, CustomerDto customer) {

    }

    @Override
    public void deleteCustomerById(UUID customerId) {

    }

    
}