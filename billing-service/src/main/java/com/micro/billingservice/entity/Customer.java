package com.micro.billingservice.entity;

import lombok.Data;

@Data
public class Customer {
    private Long id;
    private String username;
    private String email;
}
