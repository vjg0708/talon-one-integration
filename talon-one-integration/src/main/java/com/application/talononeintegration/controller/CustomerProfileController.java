package com.application.talononeintegration.controller;

import com.application.talononeintegration.DTO.CustomerProfileDTO;
import com.application.talononeintegration.service.CustomerProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @PostMapping("/addProfile")
    public ResponseEntity<Object> updateProfile(
            @RequestBody CustomerProfileDTO customerProfile){

        return ResponseEntity.ok(profileService.updateCustomerProfile(customerProfile));
    }


}
