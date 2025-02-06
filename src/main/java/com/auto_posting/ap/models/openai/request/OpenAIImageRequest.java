package com.auto_posting.ap.models.openai.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
public class OpenAIImageRequest {
    private String model;
    private String prompt;
    private int n;
    private String size;
}
