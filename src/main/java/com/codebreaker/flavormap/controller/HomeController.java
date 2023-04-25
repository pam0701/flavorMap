package com.codebreaker.flavormap.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HomeController { // 경로 이동 컨트롤러
    @GetMapping("/main")
    public List<String> home(){
        return Arrays.asList("서버 포트는 8080", "리액트 포트는 3000");
    }
}

