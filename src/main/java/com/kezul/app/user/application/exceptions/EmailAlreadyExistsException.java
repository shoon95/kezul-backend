package com.kezul.app.user.application.exceptions;

import com.kezul.app.common.exception.KezulException;
import com.kezul.app.user.domain.exception.UserErrorCode;

public class EmailAlreadyExistsException extends KezulException {
    public EmailAlreadyExistsException() {
        super(UserErrorCode.EMAIL_ALREADY_EXISTS);
    }
}
