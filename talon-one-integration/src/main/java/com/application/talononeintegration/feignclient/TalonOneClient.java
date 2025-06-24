package com.application.talononeintegration.feignclient;

import com.application.talononeintegration.DTO.CustomerProfileDTO;
import com.application.talononeintegration.DTO.CustomerSessionDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "talonOneClient",
            url = "${talon.api.base-url}"
)
public interface TalonOneClient {

    @PutMapping("/v2/customer_profiles/{integrationId}")
    ResponseEntity<Object> setCustomerProfile(
            @PathVariable("integrationId") String integrationId,
            @RequestBody CustomerProfileDTO customerProfile
            );

    /*the sessionId is the integration id generated from customerProfile*/
    @PutMapping("/v2/customer_sessions/{sessionId}")
    ResponseEntity<Object> setCustomerSession(
            @PathVariable("sessionId") String sessionId,
            @RequestBody CustomerSessionDTO customerSession
            );

    @GetMapping("/v2/customer_sessions/{sessionId}")
    ResponseEntity<Object> getCustomerSession(
            @PathVariable("sessionId") String sessionId);
}
