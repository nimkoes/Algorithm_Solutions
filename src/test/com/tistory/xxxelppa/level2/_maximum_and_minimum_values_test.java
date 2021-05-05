package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("최댓값과 최솟값")
class _maximum_and_minimum_values_test {
    
    @Builder
    @Getter
    static class TestCase {
        String s;
        
        String expected;
    }
    
    _maximum_and_minimum_values solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _maximum_and_minimum_values();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .s("1 2 3 4")
                        .expected("1 4")
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .s("-1 -2 -3 -4")
                        .expected("-4 -1")
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .s("-1 -1")
                        .expected("-1 -1")
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void name() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getS()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}