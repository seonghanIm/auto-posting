package com.auto_posting.ap.models.autopost;

import lombok.Data;

@Data
public class AutoPostingRequest {
    private String textModel;
    private String imageModel;
    private String content;


    public boolean isTextModelNUll(){
        return textModel == null;
    }

    public boolean isImageModel(){
        return imageModel == null;
    }
}
