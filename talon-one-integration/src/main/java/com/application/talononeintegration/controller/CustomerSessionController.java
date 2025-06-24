package com.application.talononeintegration.controller;

import com.application.talononeintegration.DTO.CustomerSessionDTO;
import com.application.talononeintegration.service.CustomerSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/talonOneClient/customer")
public class CustomerSessionController {

    private final CustomerSessionService sessionService;

    @Autowired
    public CustomerSessionController(CustomerSessionService sessionService) {
        this.sessionService = sessionService;
    }

    @PostMapping("/addSession")
    public ResponseEntity<Object> updateSession(
            @RequestBody CustomerSessionDTO customerSession){

        return ResponseEntity.ok(sessionService.updateCustomerSession(customerSession));
    }

    @GetMapping("/getSession/{sessionId}")
    public ResponseEntity<Object> getSession(
            @PathVariable("sessionId") String sessionId
    ){
        return ResponseEntity.ok(sessionService.getCustomerSession(sessionId));
    }

}
