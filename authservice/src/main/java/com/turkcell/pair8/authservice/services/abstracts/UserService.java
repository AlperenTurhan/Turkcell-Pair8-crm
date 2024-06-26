package com.turkcell.pair8.authservice.services.abstracts;

import com.turkcell.pair8.authservice.services.dtos.requests.RegisterRequest;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    void add(RegisterRequest request);
}
