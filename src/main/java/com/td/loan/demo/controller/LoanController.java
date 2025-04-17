package com.td.loan.demo.controller;

import com.td.loan.demo.service.LoanService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class LoanController {

    private final LoanService loanService;

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @GetMapping("loan")
    public ResponseEntity<?> getCustomerIdsByMinLoanAmount(@RequestParam Integer minLoanAmount) {

        List<String> customers = loanService.getCustomersByLoanAmount(minLoanAmount);
        return ResponseEntity.ok(customers);

    }

}
