package com.codebreaker.flavormap.controller;

import com.codebreaker.flavormap.entity.TestEntity;
import com.codebreaker.flavormap.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping("/test")
    public Mono<TestEntity> test() {
        return Mono.just(testService.getName().orElseThrow(() -> {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }));
    }
}
