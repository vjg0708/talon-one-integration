package com.application.talononeintegration.DTO;

import lombok.Data;

import java.util.List;

@Data
public class CustomerSessionDTO {

    private String sessionId;
    private String profileId;
    private List<String> couponCodes;
    private State state;
    private List<CartItemDTO> cartItems;
    private List<ResponseContent> responseContents;

    private enum State{

        open, closed, partially_returned, cancelled
    }

    private enum ResponseContent{

        customerSession, customerProfile, triggeredCampaigns, loyalty, event
    }

}
