package com.auto_posting.ap.models.openai;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
public class Messages {
    private String role;
    private String content;
    private String refusal;
}
