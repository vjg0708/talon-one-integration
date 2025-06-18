package com.application.talononeintegration.DTO;

import lombok.Data;

import java.util.Map;

@Data
public class CartItem {

    private String sku;
    private int quantity;
    private String productName;
    private double price;
    private String category;
    private Map<String, Object> attributes;
}
