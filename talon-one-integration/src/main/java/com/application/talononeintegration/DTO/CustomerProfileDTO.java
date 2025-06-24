package com.application.talononeintegration.DTO;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class CustomerProfileDTO {

    private String integrationId;

    private Map<String, Object> attributes;

    private List<ResponseContent> responseContents;

    private enum ResponseContent{

        customerProfile, triggeredCampaigns, loyalty, event
    }

}
