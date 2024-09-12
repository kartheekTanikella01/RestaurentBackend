package com.restaurent_spring.restaurent_spring.controller;

import com.restaurent_spring.restaurent_spring.dtos.SighnupRequest;
import com.restaurent_spring.restaurent_spring.dtos.userDto;
import com.restaurent_spring.restaurent_spring.services.AuthServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/auth")
public class AuthController {

    private final AuthServices authServices;

    public AuthController(AuthServices authServices) {
        this.authServices = authServices;
    }
    @PostMapping("/sighnup")
    public ResponseEntity<?> sighnupUser(@RequestBody SighnupRequest sighnupRequest){
       userDto createdUserDto= authServices.createUser(sighnupRequest);
       if(createdUserDto == null){
           return new ResponseEntity<>("User not created.Come again later",HttpStatus.BAD_REQUEST);
       }
       return new ResponseEntity<>(createdUserDto, HttpStatus.CREATED);

    }
}
