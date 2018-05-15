package com.stella.commons.dto;

import com.stella.commons.Coin;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class TokenRateDto {

    @NotNull
    private Coin coin;
    @NotNull
    private BigDecimal price;
    @NotNull
    private LocalDateTime timeCreated;
}
