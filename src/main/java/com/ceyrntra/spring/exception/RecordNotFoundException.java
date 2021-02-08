package com.ceyrntra.spring.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@NoArgsConstructor
public class RecordNotFoundException extends BaseException {

    private final String message = "Requested data not available";
    private final HttpStatus status = HttpStatus.BAD_REQUEST;
    private final int code = ResponseCode.INVALID_INPUT;
    private String description;

    public RecordNotFoundException(String description) {
        this.description = description;
    }

}
