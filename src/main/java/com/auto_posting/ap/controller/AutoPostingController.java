package com.auto_posting.ap.controller;

import com.auto_posting.ap.models.base.BaseResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auto-posting")
public class AutoPostingController {

    @PostMapping("/generate")
    public BaseResponse generatePosting(){

    }
}
