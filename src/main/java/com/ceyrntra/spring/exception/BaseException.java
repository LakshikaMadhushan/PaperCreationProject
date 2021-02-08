package com.ceyrntra.spring.exception;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BaseException extends RuntimeException{

    private String message;
    private String description;
    @JsonIgnore
    private HttpStatus status;
    private int code;
}
