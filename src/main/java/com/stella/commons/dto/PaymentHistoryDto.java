package com.stella.commons.dto;

import com.stella.commons.Coin;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaymentHistoryDto {
    // Deposit
    private String depositTx; //end-user address, where the deposit comes from

    private String depositToAddress;

    private BigDecimal depositAmount;

    private Coin depositCoin;

    private LocalDateTime depositTime;

    //Distribution
    private String distributionTx; //Ethereum distribution-related address

    private String distributionToAddress; //Stella wallet

    private BigDecimal distributionAmount;

    private LocalDateTime distributionTime;
}
