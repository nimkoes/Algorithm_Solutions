package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("기능개발")
class _function_development_test {
    
    @Builder
    @Getter
    static class TestCase {
        int[] progresses;
        int[] speeds;
        
        int[] expected;
    }
    
    _function_development solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _function_development();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .progresses(new int[]{93, 30, 55})
                        .speeds(new int[]{1, 30, 5})
                        .expected(new int[]{2, 1})
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .progresses(new int[]{95, 90, 99, 99, 80, 99})
                        .speeds(new int[]{1, 1, 1, 1, 1, 1})
                        .expected(new int[]{1, 3, 2})
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void name() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution((aCase.getProgresses()), aCase.getSpeeds()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}