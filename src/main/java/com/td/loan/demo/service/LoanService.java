package com.td.loan.demo.service;

import com.td.loan.demo.repository.LoanRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanService {

    private final LoanRepository loanRepository;

    public LoanService(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    public List<String> getCustomersByLoanAmount(int minLoanAmount, int pageNumber, int pageSize) {

        Page<String> loans = loanRepository.getLoansByCustomerAmountWithPagination(minLoanAmount, PageRequest.of(pageNumber, pageSize));
        return loans.stream().toList();

    }
}
