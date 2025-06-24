package com.application.talononeintegration.DTO;

import lombok.Data;
import one.talon.model.CustomerSessionV2;

import java.util.Map;

@Data
public class CartItemDTO {

    private String name;
    private String sku;
    private int quantity;
    private double price;
    private String category;
    private Map<String, Object> attributes;

}
