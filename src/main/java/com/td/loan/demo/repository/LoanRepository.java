package com.td.loan.demo.repository;

import com.td.loan.demo.entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {

    @Query(value = "select l.CLIENT_ID from LOAN l group by l.CLIENT_ID having sum(l.LOAN_AMOUNT) > :minLoanAmount", nativeQuery = true)
    Optional<List<String>> getLoansByCustomerAmount(@Param("minLoanAmount") Integer minLoanAmount);

}
