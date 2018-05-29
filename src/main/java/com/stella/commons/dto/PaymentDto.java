package com.stella.commons.dto;

import com.stella.commons.Coin;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDto implements Serializable {

    private Coin coin;
    private String toAddress;
    private String txId;
    private Long stellaIncomingId;
    private BigDecimal amount;
    private BigDecimal stellaTokenAmount;
    private Long blockNo;
    private LocalDateTime createdTime;
    private Set<PaymentInputDto> inputs;

}
