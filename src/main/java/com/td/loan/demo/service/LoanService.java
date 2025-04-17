package com.td.loan.demo.service;

import com.td.loan.demo.repository.LoanRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LoanService {

    private final LoanRepository loanRepository;

    public LoanService(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    public List<String> getCustomersByLoanAmount(Integer minLoanAmount) {

        Optional<List<String>> loans = loanRepository.getLoansByCustomerAmount(minLoanAmount);
        return loans.orElseGet(ArrayList::new);

    }
}
