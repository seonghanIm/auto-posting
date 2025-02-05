package com.auto_posting.ap.service.impl;

import com.auto_posting.ap.service.models.openai.Messages;
import com.auto_posting.ap.service.models.openai.request.OpenAIRequest;
import com.auto_posting.ap.service.models.openai.response.OpenAIResponse;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Arrays;
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
        fetchData();
        return "";
    }



    public void fetchData(){
        Messages messages = Messages.builder()
                .role("system").content("안녕 반가워").build();
        OpenAIRequest request = OpenAIRequest.builder().model("gpt-4o").messages(Collections.singletonList(messages)).build();
        Mono<OpenAIResponse> res =  openAIWebClient.post().body(BodyInserters.fromValue(request)).retrieve().bodyToMono(OpenAIResponse.class);

        res.subscribe(
                result -> {
                    log.info("success :: {}", result);
                },
                error ->{
                    log.error("error :: {}", error);
                }
        );
    }


}
