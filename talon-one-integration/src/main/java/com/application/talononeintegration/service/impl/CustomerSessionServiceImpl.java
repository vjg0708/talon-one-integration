package com.application.talononeintegration.service.impl;

import com.application.talononeintegration.DTO.CustomerSessionDTO;
import com.application.talononeintegration.feignclient.TalonOneClient;
import com.application.talononeintegration.service.CustomerSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerSessionServiceImpl implements CustomerSessionService {

    private final TalonOneClient talonOneClient;

    @Autowired
    public CustomerSessionServiceImpl(TalonOneClient talonOneClient) {
        this.talonOneClient = talonOneClient;
    }

    @Override
    public Object updateCustomerSession(CustomerSessionDTO customerSession) {

        return talonOneClient.setCustomerSession(
                customerSession.getSessionId(),
                customerSession
        ).getBody();
    }

    @Override
    public Object getCustomerSession(String sessionId) {

        return talonOneClient.getCustomerSession(sessionId).getBody();
    }
}
