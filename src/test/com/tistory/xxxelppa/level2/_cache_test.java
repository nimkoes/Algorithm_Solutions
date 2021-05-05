package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("캐시")
class _cache_test {
    
    @Builder
    @Getter
    static class TestCase {
        int cacheSize;
        String[] cities;
        
        int expected;
    }
    
    _cache solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _cache();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .cacheSize(3)
                        .cities(new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"})
                        .expected(50)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .cacheSize(3)
                        .cities(new String[]{"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"})
                        .expected(21)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .cacheSize(2)
                        .cities(new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"})
                        .expected(60)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .cacheSize(5)
                        .cities(new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"})
                        .expected(52)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .cacheSize(2)
                        .cities(new String[]{"Jeju", "Pangyo", "NewYork", "newyork"})
                        .expected(16)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .cacheSize(0)
                        .cities(new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA"})
                        .expected(25)
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void name() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getCacheSize(), aCase.getCities()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}