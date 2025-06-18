package com.application.talononeintegration.service.impl;

import com.application.talononeintegration.DTO.CustomerProfileRequest;
import com.application.talononeintegration.DTO.CustomerSessionRequest;
import com.application.talononeintegration.feignclient.TalonOneClient;
import com.application.talononeintegration.service.TalonIntegrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TalonIntegrationServiceImpl implements TalonIntegrationService {

    private final TalonOneClient talonOneClient;

    @Autowired
    public TalonIntegrationServiceImpl(TalonOneClient talonOneClient) {
        this.talonOneClient = talonOneClient;
    }

    @Override
    public String updateCustomerProfile(CustomerProfileRequest customerProfile) {

        return talonOneClient.setCustomerProfile(
                customerProfile.getIntegrationId(),
                customerProfile
        ).getBody();
    }

    @Override
    public String updateCustomerSession(CustomerSessionRequest customerSession) {

        return talonOneClient.setCustomerSession(
                customerSession.getSessionId(),
                customerSession
        ).getBody();
    }

}
