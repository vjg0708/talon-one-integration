package com.application.talononeintegration.service;

import com.application.talononeintegration.DTO.CustomerProfileRequest;
import com.application.talononeintegration.DTO.CustomerSessionRequest;

public interface CustomerProfileService {

    public String updateCustomerProfile(
            CustomerProfileRequest customerProfile
    );


}
