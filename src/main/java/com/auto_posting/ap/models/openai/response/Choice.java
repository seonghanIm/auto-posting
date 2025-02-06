package com.auto_posting.ap.models.openai.response;


import com.auto_posting.ap.models.openai.Messages;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
public class Choice {
    private int index;
    private Messages message;
    private String logprobs;
    @JsonProperty("finish_reason")
    private String finishReason;
}
