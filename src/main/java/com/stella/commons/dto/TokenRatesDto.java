package com.stella.commons.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class TokenRatesDto {

    private BigDecimal btc;
    private BigDecimal eth;
    private BigDecimal ltc;
    private BigDecimal xrp;
}
