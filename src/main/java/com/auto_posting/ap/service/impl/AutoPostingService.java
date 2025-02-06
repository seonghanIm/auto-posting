package com.auto_posting.ap.service.impl;

import com.auto_posting.ap.models.autopost.AutoPostingRequest;
import com.auto_posting.ap.models.base.BaseResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@RequiredArgsConstructor
public class AutoPostingService {
    private final OpenAIService openAIService;


    /**
     *  자동 포스팅 서비스
     *  INPUT: text model, image model ,content(필수값)
     *  1. 4o 를 사용해서 자동 포스팅 글 생성
     *  2. 생성된 글을 바탕으로 이미지 URL 생성 -> URL을 파일로 바꿔서 S3 에 업로드 -> 글의 img 태그에다가 s3 url 삽입
     *  3. 이미지 url과 글을 DB 저장
     **/


    public BaseResponse generateAutoPosting(AutoPostingRequest autoPostingRequest){
        try {

        }catch (Exception e){

        }
    }
}
