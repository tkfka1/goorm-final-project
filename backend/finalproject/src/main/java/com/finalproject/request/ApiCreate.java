package com.finalproject.request;

import lombok.*;

import javax.validation.constraints.NotBlank;

@ToString
@Setter
@Getter
public class ApiCreate {
    @NotBlank(message = "타이틀 값이 입력이 안됨")
    private String title;
    @NotBlank(message = "컨텐츠 값이 입력이 안됨")
    private String content;

    @Builder
    public ApiCreate(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
