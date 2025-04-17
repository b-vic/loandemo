package com.td.loan.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Loan {

    @Id
    @Column(name = "LOAN_ID")
    private long loanId;

    @Column(name = "LOAN_AMOUNT")
    private int loanAmount;

    @Column(name = "CLIENT_ID")
    private String clientId;

    @Column(name = "LOAN_DURATION_MONTHS")
    private int loanDurationMonths;

    public long getLoanId() {
        return loanId;
    }

    public void setLoanId(long loanId) {
        this.loanId = loanId;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public int getLoanDurationMonths() {
        return loanDurationMonths;
    }

    public void setLoanDurationMonths(int loanDurationMonths) {
        this.loanDurationMonths = loanDurationMonths;
    }


}
