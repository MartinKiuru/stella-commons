package com.stella.commons.controller;

import com.stella.commons.ErrorCode;
import com.stella.commons.StellaResponse;
import org.apache.commons.lang3.ArrayUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.Collections;

/**
 * All controller specific controller commons methods and definitions should be written in this class
 * @author sinan.sahin
 */
public abstract class AbstractController {

    protected Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    protected <T> ResponseEntity<StellaResponse> createSuccess(T payload, String ... messages) {
        StellaResponse<T> success = StellaResponse.<T>builder()
            .errorCode(null)
            .payload(payload)
            .build();
        if (ArrayUtils.isNotEmpty(messages)) {
            success.setMessages(Arrays.asList(messages));
        }
        return ResponseEntity.ok(success);
    }

    protected <T> ResponseEntity<StellaResponse> createFailure(ErrorCode errorCode, HttpStatus httpStatus, String ... messages) {
        StellaResponse<T> failure = StellaResponse.<T>builder()
            .errorCode(errorCode)
            .build();

        if (ArrayUtils.isNotEmpty(messages)) {
            failure.setMessages(Arrays.asList(messages));
        }

        return new ResponseEntity<>(failure, httpStatus);
    }
}
