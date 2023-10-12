package com.micro.inventoryservice;

import com.micro.inventoryservice.entity.Product;
import com.micro.inventoryservice.repository.ProductRestResourceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ProductRestResourceRepository productRestResourceRepository) {
		return args -> {
			productRestResourceRepository.save(new Product(1L, "prod 1", 100));
			productRestResourceRepository.save(new Product(2L, "prod 2", 200));
			productRestResourceRepository.save(new Product(3L, "prod 3", 300));
		};
	}
}
