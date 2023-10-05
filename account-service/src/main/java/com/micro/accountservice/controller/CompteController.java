package com.micro.accountservice.controller;


import com.micro.accountservice.entity.Account;
import com.micro.accountservice.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/accounts")
public class CompteController {

    private AccountService accountService;


    @GetMapping
    public List<Account> index() {
        return accountService.index();
    }

    @GetMapping("/{id}")
    public Account show(@PathVariable Long id) {
        return accountService.show(id);
    }

    @PostMapping
    public Account create(@RequestBody Account account) {
        return accountService.create(account);
    }

    @PutMapping
    public Account update(@RequestBody Account account) {
        return accountService.update(account);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        accountService.delete(id);
    }
}
