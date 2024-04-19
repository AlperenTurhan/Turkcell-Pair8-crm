package com.turkcell.pair8.customerservice.services.rules;

import com.turkcell.pair8.customerservice.core.exception.types.BusinessException;
import com.turkcell.pair8.customerservice.core.services.abstracts.MessageService;
import com.turkcell.pair8.customerservice.core.services.constants.Messages;
import com.turkcell.pair8.customerservice.entities.Customer;
import com.turkcell.pair8.customerservice.repositories.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@RequiredArgsConstructor
@Component
public class CustomerBusinessRules
{
    private final CustomerRepository customerRepository;
    private final MessageService messageService;

    public void customerWithSameNationalityIDCanNotExist(String nationalityID)
    {
        Optional<Customer> customer = customerRepository.findByNationalityID(nationalityID);

        if(customer.isPresent())
            throw new  BusinessException(messageService.getMessage(Messages.BusinessErrors.CUSTOMERS_WITH_SAME_NATIONAL_ID_SHOULD_NOT_EXIST));
    }
}