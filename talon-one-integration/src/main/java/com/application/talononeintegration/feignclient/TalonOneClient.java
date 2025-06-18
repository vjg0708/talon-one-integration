package com.application.talononeintegration.feignclient;

import com.application.talononeintegration.DTO.CustomerProfileRequest;
import com.application.talononeintegration.DTO.CustomerSessionRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "talonOneClient",
            url = "${talon.api.base-url}"
)
public interface TalonOneClient {

    @PutMapping("/v2/customer_profiles/{integrationId}")
    ResponseEntity<String> setCustomerProfile(
            @PathVariable("integrationId") String integrationId,
            @RequestBody CustomerProfileRequest customerProfile
            );

    /*the sessionId is the integration id generated from customerProfile*/
    @PutMapping("/v2/customer_sessions/{sessionId}")
    ResponseEntity<String> setCustomerSession(
            @PathVariable("sessionId") String sessionId,
            @RequestBody CustomerSessionRequest customerSession
            );
}
