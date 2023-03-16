package com.finalproject.service;

import com.finalproject.domain.Data;
import com.finalproject.repository.DataRepository;

import com.finalproject.request.ApiCreate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GotoDBServiceTest {

    @Autowired
    private GotoDBService gotoDBService;
    @Autowired
    private DataRepository dataRepository;

    @Test
    @DisplayName("db 테스트 하기")
    void test1(){
        //given
        ApiCreate apiCreate = ApiCreate.builder()
                .title("제목입니다.")
                .content("내용입니다.")
                .build();

        // when
        gotoDBService.goDB(apiCreate);

        // then
        Assertions.assertEquals(1l,dataRepository.count());
        Data data = dataRepository.findAll().get(0);
        assertEquals("제목입니다.", data.getTitle());
        assertEquals("내용입니다.", data.getContent());
    }
}