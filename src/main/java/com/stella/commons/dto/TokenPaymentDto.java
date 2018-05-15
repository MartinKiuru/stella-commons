package com.stella.commons.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@Builder
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class TokenPaymentDto {

    @NotNull
    private TokenRateDto token_rate;
    @NotNull
    private boolean isBounty;
    @NotNull
    private BigDecimal amount;
    @NotNull
    private boolean isTransactionSuccesful;
}
