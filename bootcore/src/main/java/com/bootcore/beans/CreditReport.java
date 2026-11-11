package com.bootcore.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class CreditReport {
    @Value("${creditScore}")
    private int creditScore;
    @Value("${description}")
    private String description;
    @Autowired
    private LoanApplication loanApplication;
}
