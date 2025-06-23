package com.application.talononeintegration.service;

import com.application.talononeintegration.DTO.CustomerSessionRequest;

public interface CustomerSessionService {

    public String updateCustomerSession(
            CustomerSessionRequest customerSession
    );
}
