package com.auto_posting.ap.models.openai.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
public class Data {
    private String url;
}
