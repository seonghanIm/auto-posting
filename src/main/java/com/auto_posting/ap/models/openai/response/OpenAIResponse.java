package com.auto_posting.ap.models.openai.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Builder
@Getter
public class OpenAIResponse {
    private String id;
    private String object;
    private String created;
    private String model;
    private List<Choice> choices;
    private Usage usage;

    @JsonProperty("service_tier")
    private String serviceTier;
    @JsonProperty("system_fingerprint")
    private String SystemFingerPrint;
}
