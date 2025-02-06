package com.auto_posting.ap.models.openai.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
public class PromptTokensDetails {
    private int cachedTokens;
    private int audioTokens;
}
