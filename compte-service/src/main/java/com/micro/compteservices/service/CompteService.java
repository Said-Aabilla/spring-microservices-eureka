package com.micro.compteservices.service;


import com.micro.compteservices.entity.Compte;
import com.micro.compteservices.repository.CompteRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CompteService {

    private CompteRepository compteRepository;

    public List<Compte> index(){
        return compteRepository.findAll();
    }

    public Compte show(Long id){
        return compteRepository.findById(id).orElseThrow(ResourceNotFoundException::new);
    }

    public Compte create(Compte compte){
        return compteRepository.save(compte);
    }

    public Compte update(Compte compte){
        return compteRepository.save(compte);
    }

    public void delete(Long id){
         compteRepository.deleteById(id);
    }
}
