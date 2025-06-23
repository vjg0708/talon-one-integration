package com.application.talononeintegration.controller;

import com.application.talononeintegration.DTO.CustomerProfileRequest;
import com.application.talononeintegration.service.CustomerProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/talonOneClient/customer")
public class CustomerProfileController {

    private final CustomerProfileService profileService;

    @Autowired
    public CustomerProfileController(CustomerProfileService profileService) {

        this.profileService = profileService;
    }

    @PostMapping("/profile")
    public String updateProfile(
            @RequestBody CustomerProfileRequest customerProfile){

        return profileService.updateCustomerProfile(customerProfile);
    }


}
