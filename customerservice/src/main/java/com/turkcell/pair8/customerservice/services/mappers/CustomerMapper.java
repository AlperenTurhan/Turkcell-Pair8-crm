package com.turkcell.pair8.customerservice.services.mappers;

import com.turkcell.pair8.customerservice.entities.Customer;
import com.turkcell.pair8.customerservice.entities.IndividualCustomer;
import com.turkcell.pair8.customerservice.services.dtos.customer.request.AddCustomerRequest;
import com.turkcell.pair8.customerservice.services.dtos.customer.request.UpdateCustomerRequest;
import com.turkcell.pair8.customerservice.services.dtos.customer.response.AddCustomerResponse;
import com.turkcell.pair8.customerservice.services.dtos.customer.response.GetAllCustomerResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
@Mapper
public interface CustomerMapper {
    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    IndividualCustomer customerFromAddRequest(AddCustomerRequest request);

    GetAllCustomerResponse dtoFromGetAllRequest(IndividualCustomer customer);

    void updateCustomerFromRequest(UpdateCustomerRequest request, @MappingTarget IndividualCustomer customer);

    AddCustomerResponse responseFromAddRequest(IndividualCustomer customer);
}