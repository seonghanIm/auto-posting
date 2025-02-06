package com.auto_posting.ap.models.base;

import lombok.Data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
public class BaseRequest<T> {
    private String timestamp;
    private T requestBody;

    public BaseRequest() {
        this.timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
    }
}
