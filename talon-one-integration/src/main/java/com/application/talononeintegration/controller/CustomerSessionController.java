package com.application.talononeintegration.controller;

import com.application.talononeintegration.DTO.CustomerSessionRequest;
import com.application.talononeintegration.service.CustomerSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/talonOneClient/customer")
public class CustomerSessionController {

    private final CustomerSessionService sessionService;

    @Autowired
    public CustomerSessionController(CustomerSessionService sessionService) {
        this.sessionService = sessionService;
    }

    @PostMapping("/session")
    public String updateSession(
            @RequestBody CustomerSessionRequest customerSession){

        return sessionService.updateCustomerSession(customerSession);
    }

}
