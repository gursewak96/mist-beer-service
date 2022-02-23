package com.harry.mistbeerservice.service;

import com.harry.mistbeerservice.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {

    public CustomerDto getCustomerById(UUID customerid) {
        return CustomerDto.builder().id(UUID.randomUUID()).name("Captain America")
                .build();
    }

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {
        return CustomerDto.builder().id(UUID.randomUUID()).name("Jacob").build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        //todo update customer
    }

    @Override
    public void deleteById(UUID customerId) {
        //todo delete a customer using customer id
    }
}
