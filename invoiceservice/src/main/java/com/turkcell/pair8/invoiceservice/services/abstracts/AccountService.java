package com.turkcell.pair8.invoiceservice.services.abstracts;

import com.turkcell.pair8.invoiceservice.services.dtos.requests.AddBillingRequest;
import com.turkcell.pair8.invoiceservice.services.dtos.requests.UpdateAccountRequest;
import com.turkcell.pair8.invoiceservice.services.dtos.responses.AccountResponse;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AccountService {
    List<AccountResponse> getAll(Pageable pageable);

    void add(AddBillingRequest request);

    String delete(int id);

    void update(UpdateAccountRequest updateAccountRequest);
}
