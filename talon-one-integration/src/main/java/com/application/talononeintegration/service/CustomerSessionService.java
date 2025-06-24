package com.application.talononeintegration.service;

import com.application.talononeintegration.DTO.CustomerSessionDTO;

public interface CustomerSessionService {

    public Object updateCustomerSession(
            CustomerSessionDTO customerSession
    );

    public Object getCustomerSession(
            String sessionId
    );
}
