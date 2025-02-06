package com.auto_posting.ap.models.base;


import com.auto_posting.ap.models.code.RESPONSE_CODE;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BaseResponse<T> {
    private int code = 0;
    private String message = "";
    private T data;

    public BaseResponse(int code , String message){
        this.code = code;
        this.message = message;
    }

    @Builder
    public BaseResponse(int code , String message, T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> BaseResponse<T> successOf(T data){
        return BaseResponse.<T>builder()
                .code(RESPONSE_CODE.SUCCESS.getCode())
                .message(RESPONSE_CODE.SUCCESS.getMessage())
                .data(data)
                .build();
    }


}
