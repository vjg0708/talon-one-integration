package com.application.talononeintegration.config;

import com.application.talononeintegration.configproperties.TalonOneProperties;
import feign.RequestInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenFeignConfig {

    private final TalonOneProperties talonOneProperties;

    @Autowired
    public OpenFeignConfig(TalonOneProperties talonOneProperties) {

        this.talonOneProperties = talonOneProperties;
    }

    @Bean
    public RequestInterceptor requestInterceptor(){

        return requestTemplate ->{
            requestTemplate.header(
                    "Authorization", "ApiKey-V1 "+talonOneProperties.getKey());
        };
    }
}
