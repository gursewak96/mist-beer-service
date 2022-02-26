package com.harry.mistbeerservice.web.mappers;

import com.harry.mistbeerservice.domain.Customer;
import com.harry.mistbeerservice.web.model.v2.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    Customer customerDtoToCustomer(CustomerDto customerDto);
    CustomerDto customerToCustomerDto(Customer customer);
}
