package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("실패율")
class _failure_rate_test {
    
    @Builder
    @Getter
    static class TestCase {
        int N;
        int[] stage;
        
        int[] expected;
    }
    
    _failure_rate solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _failure_rate();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .N(5)
                        .stage(new int[]{2, 1, 2, 6, 2, 4, 3, 3})
                        .expected(new int[]{3, 4, 2, 1, 5})
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .N(4)
                        .stage(new int[]{4, 4, 4, 4, 4})
                        .expected(new int[]{4, 1, 2, 3})
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void solution() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getN(), aCase.getStage()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}