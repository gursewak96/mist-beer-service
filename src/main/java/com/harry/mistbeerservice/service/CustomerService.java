package com.harry.mistbeerservice.service;


import com.harry.mistbeerservice.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;


public interface CustomerService {
    public CustomerDto getCustomerById(UUID customerid);

    public CustomerDto saveCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteById(UUID customerId);
}
