package com.stella.commons.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaymentInputDto implements Serializable {

    private String fromAddress;
    private Long inputNo;
    private LocalDateTime createdTime;

}
