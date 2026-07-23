package com.example.loan.controller;
import com.example.loan.model.Loan;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/loan")
public class LoanController{
@GetMapping("/{id}")
public Loan getLoan(@PathVariable int id){
return new Loan(id,"Home Loan",800000);
}
}