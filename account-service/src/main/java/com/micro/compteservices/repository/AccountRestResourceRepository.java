package com.micro.accountservice.repository;

import com.micro.accountservice.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "accounts")
public interface AccountRestResourceRepository extends JpaRepository<Account, Long> {
}
