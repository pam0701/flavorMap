package com.codebreaker.flavormap.repository;

import com.codebreaker.flavormap.entity.TestEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.CrudRepository;


public interface TestRepository extends CrudRepository<TestEntity, Long> {
}
