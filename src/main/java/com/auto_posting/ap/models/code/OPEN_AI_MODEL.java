package com.auto_posting.ap.models.code;

import lombok.Getter;

@Getter
public enum OPEN_AI_MODEL {

    GPT_4("gpt-40"),
    DALL_E_2("dall-e-2"),
    DALL_E_3("dall-e-3");

    private String model;

    OPEN_AI_MODEL(String model){
        model = this.model;
    }
}
