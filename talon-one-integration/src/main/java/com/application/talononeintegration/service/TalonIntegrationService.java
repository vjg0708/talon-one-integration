package com.application.talononeintegration.service;

import com.application.talononeintegration.DTO.CustomerProfileRequest;
import com.application.talononeintegration.DTO.CustomerSessionRequest;

public interface TalonIntegrationService {

    public String updateCustomerProfile(
            CustomerProfileRequest customerProfile
    );

    public String updateCustomerSession(
            CustomerSessionRequest customerSession
    );
}
