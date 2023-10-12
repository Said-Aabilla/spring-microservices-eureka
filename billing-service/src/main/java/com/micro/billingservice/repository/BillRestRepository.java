package com.micro.billingservice.repository;

import com.micro.billingservice.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "bills")
public interface BillRestRepository extends JpaRepository<Bill, Long> {

}
