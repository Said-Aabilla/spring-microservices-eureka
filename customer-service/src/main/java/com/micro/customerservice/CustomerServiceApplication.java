package com.micro.customerservice;

import com.micro.customerservice.entity.Customer;
import com.micro.customerservice.repository.CustomerRestResourceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CustomerRestResourceRepository customerRestResourceRepository) {
		return args -> {
			customerRestResourceRepository.save(new Customer(1L, "customer 1", "cust1@micro.com"));
			customerRestResourceRepository.save(new Customer(2L, "customer 2", "cust2@micro.com"));
			customerRestResourceRepository.save(new Customer(3L, "customer 3", "cust3@micro.com"));
		};
	}
}
