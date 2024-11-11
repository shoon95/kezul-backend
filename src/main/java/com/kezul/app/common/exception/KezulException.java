package com.kezul.app.common.exception;

import lombok.Getter;


public class KezulException extends RuntimeException{
    private final ErrorCode errorCode;

    public KezulException(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }
}
