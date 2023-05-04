package com.codebreaker.flavormap.service;

import com.codebreaker.flavormap.entity.TestEntity;
import com.codebreaker.flavormap.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TestService {
    private final TestRepository testRepository;

    public Optional<TestEntity> getName() {
        return testRepository.findById(1l);
    }
}
