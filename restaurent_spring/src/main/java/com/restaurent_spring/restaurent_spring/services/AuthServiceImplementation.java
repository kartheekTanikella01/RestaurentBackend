package com.restaurent_spring.restaurent_spring.services;

import com.restaurent_spring.restaurent_spring.dtos.SighnupRequest;
import com.restaurent_spring.restaurent_spring.dtos.userDto;
import com.restaurent_spring.restaurent_spring.entities.user;
import com.restaurent_spring.restaurent_spring.enums.UserRole;
import com.restaurent_spring.restaurent_spring.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImplementation implements AuthServices {
    private  final UserRepository userRepository;



    public AuthServiceImplementation(UserRepository userRepository) {
        this.userRepository = userRepository;

    }


    @Override
    public userDto createUser(SighnupRequest sighnupRequest) {
        user user1 = new user();
        user1.setName(sighnupRequest.getName());
        user1.setEmail(sighnupRequest.getEmail());
        user1.setPassword(new BCryptPasswordEncoder().encode(sighnupRequest.getPassword()));
        user1.setUserRole(UserRole.Customer);
        userRepository.save(user1);
        user createdUser=userRepository.save(user1);
        userDto createduserDto=new userDto();
        createduserDto.setId(createdUser.getId());
        createduserDto.setName(createdUser.getName());
        createduserDto.setEmail(createdUser.getEmail());
        createduserDto.setUserRole(createdUser.getUserRole());

        return createduserDto;
    }

}
