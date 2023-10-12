package com.micro.billingservice;

import com.micro.billingservice.client.CustomerServiceClient;
import com.micro.billingservice.client.InventoryServiceClient;
import com.micro.billingservice.entity.Bill;
import com.micro.billingservice.entity.Customer;
import com.micro.billingservice.entity.ProductItem;
import com.micro.billingservice.repository.BillRestRepository;
import com.micro.billingservice.repository.ProductItemRestRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
@EnableFeignClients
public class BillingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BillingServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(BillRestRepository billRestRepository,
                            ProductItemRestRepository productItemRestRepository,
                            CustomerServiceClient customerServiceClient,
                            InventoryServiceClient inventoryServiceClient) {
        return args -> {

            //create the bill
            Bill bill = new Bill();
            bill.setBillingDate(new Date());
            Customer customer = customerServiceClient.findCustomerById(1L);
            System.out.println(customerServiceClient.findCustomerById(1L).toString());
            bill.setCustomerId(customer.getId());
            billRestRepository.save(bill);

            //create the productItems
            inventoryServiceClient.index().forEach(product -> {
                productItemRestRepository.save(new ProductItem(null, product.getPrice(), (int) (Math.random() * 500), product, product.getId(), bill));
            });
        };
    }
}
