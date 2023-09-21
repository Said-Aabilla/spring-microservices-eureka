package com.micro.compteservices.controller;


import com.micro.compteservices.entity.Compte;
import com.micro.compteservices.service.CompteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/comptes")
public class CompteController {

    private CompteService compteService;


    @GetMapping
    public List<Compte> index() {
        return compteService.index();
    }

    @GetMapping("/{id}")
    public Compte show(@PathVariable Long id) {
        return compteService.show(id);
    }

    @PostMapping
    public Compte create(@RequestBody Compte compte) {
        return compteService.create(compte);
    }

    @PutMapping
    public Compte update(@RequestBody Compte compte) {
        return compteService.update(compte);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        compteService.delete(id);
    }
}
