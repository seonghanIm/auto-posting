package com.auto_posting.ap.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Value("${openai.address}")
    private String openAiAddress;

    @Value("${openai.key}")
    private String openAiKey;


    @Bean
    public WebClient.Builder webClientBuilder() {
        return WebClient.builder();
    }

    @Bean("OpenAIWebClient")
    public WebClient webClient(WebClient.Builder builder){
        return builder.baseUrl(openAiAddress)
                .defaultHeaders(httpHeaders -> {
                    httpHeaders.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
                    httpHeaders.add("Authorization","Bearer " + openAiKey);
                })
                .build();
    }

}
