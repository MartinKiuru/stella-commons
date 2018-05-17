package com.stella.commons.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserAddressesDto implements Serializable {

    private String stellaAddress;
    private String stellaPublicKey;
    private String bitcoinAddress;
    private String ethereumAddress;
    private String litecoinAddress;
    private String rippleTag;
    private String userEmail;
}
