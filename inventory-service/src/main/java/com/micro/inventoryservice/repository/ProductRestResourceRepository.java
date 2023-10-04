package com.micro.inventoryservice.repository;
import com.micro.inventoryservice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "products")
public interface ProductRestResourceRepository extends JpaRepository<Product, Long> {
}
