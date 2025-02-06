package com.auto_posting.ap.models.openai.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
public class CompletionTokenDetails {
    @JsonProperty("reasoning_tokens")
    private int reasoningTokens;
    @JsonProperty("audio_tokens")
    private int audioTokens;
    @JsonProperty("accepted_prediction_tokens")
    private int acceptPredictionTokens;
    @JsonProperty("rejected_prediction_tokens")
    private int rejectedPredictionTokens;
}
