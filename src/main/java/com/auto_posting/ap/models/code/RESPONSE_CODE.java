package com.auto_posting.ap.models.code;

import lombok.Getter;

@Getter
public enum RESPONSE_CODE {
    SUCCESS(0,"성공"),
    ERROR(1000, "에러");

    private int code;
    private String message;

    RESPONSE_CODE(int code, String message){
        this.code = code;
        this.message = message;
    }
}
