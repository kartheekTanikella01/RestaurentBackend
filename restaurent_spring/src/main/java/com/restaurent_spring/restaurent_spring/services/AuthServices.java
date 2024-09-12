package com.restaurent_spring.restaurent_spring.services;

import com.restaurent_spring.restaurent_spring.dtos.SighnupRequest;
import com.restaurent_spring.restaurent_spring.dtos.userDto;

public interface AuthServices {
    userDto createUser(SighnupRequest sighnupRequest);
}

