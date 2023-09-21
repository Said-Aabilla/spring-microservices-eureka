package com.micro.compteservices.repository;

import com.micro.compteservices.entity.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "accounts")
public interface CompteRestResourceRepository extends JpaRepository<Compte, Long> {
}
