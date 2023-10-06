package com.micro.accountservice.service;


import com.micro.accountservice.entity.Account;
import com.micro.accountservice.repository.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AccountService {

    private AccountRepository accountRepository;

    public List<Account> index(){
        return accountRepository.findAll();
    }

    public Account show(Long id){
        return accountRepository.findById(id).orElseThrow(ResourceNotFoundException::new);
    }

    public Account create(Account account){
        return accountRepository.save(account);
    }

    public Account update(Account account){
        return accountRepository.save(account);
    }

    public void delete(Long id){
        accountRepository.deleteById(id);
    }
}
