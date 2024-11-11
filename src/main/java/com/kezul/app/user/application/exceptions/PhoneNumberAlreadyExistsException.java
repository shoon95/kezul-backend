package com.kezul.app.user.application.exceptions;

import com.kezul.app.common.exception.KezulException;
import com.kezul.app.user.domain.exception.UserErrorCode;

public class PhoneNumberAlreadyExistsException extends KezulException {
    public PhoneNumberAlreadyExistsException() {
        super(UserErrorCode.PHONE_NUMBER_ALREADY_EXISTS);
    }
}
