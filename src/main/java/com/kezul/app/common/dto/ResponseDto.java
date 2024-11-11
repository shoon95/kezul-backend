package com.kezul.app.common.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ResponseDto<T> {

    private String message;
    private String status;
    private T data;

    public static <T> ResponseDto <T> success(String meesage) {
        return new ResponseDto<>("success", meesage, null);
    }

    public static <T> ResponseDto<T> success(String message, T data) {
        return new ResponseDto<>("success", message, data);
    }

    public static <T> ResponseDto <T> error(String message) {
        return new ResponseDto<>("error", message, null);
    }
}
