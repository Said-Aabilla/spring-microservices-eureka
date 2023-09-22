package com.micro.customerservice.projection;

import com.micro.customerservice.entity.Customer;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fullCustomer", types = Customer.class)
public interface CustomerProjection extends Projection{
    public Long getId();
    public String getUsername();
    public String getEmail();
}
