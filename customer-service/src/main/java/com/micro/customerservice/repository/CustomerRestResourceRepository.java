package com.micro.customerservice.repository;
import com.micro.customerservice.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "customers")
public interface CustomerRestResourceRepository extends JpaRepository<Customer, Long> {
}
