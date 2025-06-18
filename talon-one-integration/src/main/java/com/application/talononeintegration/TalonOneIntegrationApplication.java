package com.application.talononeintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = {"com.application.talononeintegration.feignclient"})
public class TalonOneIntegrationApplication {

    public static void main(String[] args) {

        SpringApplication.run(TalonOneIntegrationApplication.class, args);
    }

}
