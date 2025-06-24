package com.application.talononeintegration.service.impl;

import com.application.talononeintegration.DTO.CustomerProfileDTO;
import com.application.talononeintegration.feignclient.TalonOneClient;
import com.application.talononeintegration.service.CustomerProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerProfileServiceImpl implements CustomerProfileService {

    private final TalonOneClient talonOneClient;

    @Autowired
    public CustomerProfileServiceImpl(TalonOneClient talonOneClient) {
        this.talonOneClient = talonOneClient;
    }

    @Override
    public Object updateCustomerProfile(CustomerProfileDTO customerProfile) {

        return talonOneClient.setCustomerProfile(
                customerProfile.getIntegrationId(),
                customerProfile
        ).getBody();
    }



}
