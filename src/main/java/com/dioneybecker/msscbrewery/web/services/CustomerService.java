package com.dioneybecker.msscbrewery.web.services;

import java.util.UUID;

import com.dioneybecker.msscbrewery.web.model.CustomerDto;

/**
 * CustomerService
 */
public interface CustomerService {

    CustomerDto getCustomerById(UUID customerId);

    CustomerDto saveCustomer(CustomerDto customer);

    void updateCustomerById(UUID cusomerId, CustomerDto customer);

    void deleteCustomerById(UUID customerId);
}