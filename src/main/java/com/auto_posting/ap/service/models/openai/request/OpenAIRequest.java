package com.auto_posting.ap.service.models.openai.request;


import com.auto_posting.ap.service.models.openai.Messages;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Builder
@Getter
public class OpenAIRequest {
    private String model;
    private List<Messages> messages;
}
