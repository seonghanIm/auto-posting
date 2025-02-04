package com.auto_posting.ap.service;

public interface GenerativeAIService {

    /**
     * 주어진 프롬프트를 기반으로 콘텐츠를 생성하는 메서드
     * @param prompt 생성할 콘텐츠의 주제 또는 내용
     * @return 생성된 콘텐츠 문자열
     */
    String generateContent(String prompt);


}
