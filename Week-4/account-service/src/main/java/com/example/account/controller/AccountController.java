package com.example.account.controller;
import com.example.account.model.Account;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/account")
public class AccountController{
@GetMapping("/{id}")
public Account getAccount(@PathVariable int id){
return new Account(id,"Priyanka",50000);
}
}