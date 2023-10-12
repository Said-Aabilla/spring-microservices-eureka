package com.micro.billingservice.repository;

import com.micro.billingservice.entity.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(path = "product-items")
public interface ProductItemRestRepository extends JpaRepository<ProductItem, Long> {
     List<ProductItem> findByBillId(Long id);
}