package com.stella.commons.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@EqualsAndHashCode
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto implements Serializable {

    @NotNull
    private String email;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    private String companyName;

    @NotNull
    private LocalDate birthDate;

    private String password;

    private String stellaWalletAddress;
    private String stellaWalletPublicKey;
    private String bitcoinAddress;
    private String ethereumAddress;
    private String litecoinAddress;
    private String rippleAddress;
    private String resetToken;
}
