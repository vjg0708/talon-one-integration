package com.application.talononeintegration.controller;

import com.application.talononeintegration.DTO.CustomerProfileRequest;
import com.application.talononeintegration.DTO.CustomerSessionRequest;
import com.application.talononeintegration.service.TalonIntegrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/talonOneClient")
public class TalonOneIntegrationController {

    private final TalonIntegrationService talonService;

    @Autowired
    public TalonOneIntegrationController(TalonIntegrationService talonService) {
        this.talonService = talonService;
    }

    @PostMapping("/profile")
    public String updateProfile(
            @RequestBody CustomerProfileRequest customerProfile){

        return talonService.updateCustomerProfile(customerProfile);
    }

    @PostMapping("/session")
    public String updateSession(
            @RequestBody CustomerSessionRequest customerSession){

        return talonService.updateCustomerSession(customerSession);
    }
}
