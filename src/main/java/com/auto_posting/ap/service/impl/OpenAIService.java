package com.auto_posting.ap.service.impl;

import com.auto_posting.ap.models.code.OPEN_AI_MODEL;
import com.auto_posting.ap.models.openai.Messages;
import com.auto_posting.ap.models.openai.request.OpenAIImageRequest;
import com.auto_posting.ap.models.openai.request.OpenAIRequest;
import com.auto_posting.ap.models.openai.response.OpenAIImageResponse;
import com.auto_posting.ap.models.openai.response.OpenAIResponse;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Collections;

@Service
@RequiredArgsConstructor
@Slf4j
public class OpenAIService {

    @Qualifier("OpenAIWebClient")
    private final WebClient openAIWebClient;

//    @Override
    @PostConstruct
    public String generateContent() {
//        fetchImage();
        return "";
    }



    public void fetchData(OPEN_AI_MODEL model, String content){
        Messages messages = Messages.builder()
                .role("system").content(content).build();
        OpenAIRequest request = OpenAIRequest.builder().model(model.getModel()).messages(Collections.singletonList(messages)).build();
        Mono<OpenAIResponse> res =  openAIWebClient.post().uri("/chat/completions").body(BodyInserters.fromValue(request)).retrieve().bodyToMono(OpenAIResponse.class);

        res.subscribe(
                result -> {
                    log.info("success :: {}", result);
                },
                error ->{
                    log.error("error :: {}", error);
                }
        );
    }

    public void fetchImage(OPEN_AI_MODEL model,int count, String content, String size){
        OpenAIImageRequest openAIImageRequest = OpenAIImageRequest.builder().model(model.getModel()).n(count).prompt(content).size(size).build();
        Mono<OpenAIImageResponse> res = openAIWebClient.post().uri("/images/generations").body(BodyInserters.fromValue(openAIImageRequest)).retrieve().bodyToMono(OpenAIImageResponse.class);

        res.subscribe(
                result -> {
                    log.info("success :: {}", result);
                },
                error -> {
                    log.error("error :: {}", error.toString());
                }
        );
    }


}

