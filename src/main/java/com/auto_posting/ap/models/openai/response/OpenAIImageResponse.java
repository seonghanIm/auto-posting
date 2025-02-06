package com.auto_posting.ap.models.openai.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Builder
@Getter
public class OpenAIImageResponse {
    private String created;
    private List<Data> data;

}
