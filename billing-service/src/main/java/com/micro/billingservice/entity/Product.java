package com.micro.billingservice.entity;

import lombok.Data;

@Data
public class Product {
    private Long id;
    private String name;
    private double price;
}
