package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("예상 대진표")
class _knockout_stage_prediction_test {
    
    @Builder
    @Getter
    static class TestCase {
        int n;
        int a;
        int b;
        
        int expected;
    }
    
    _knockout_stage_prediction solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _knockout_stage_prediction();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .n(8)
                        .a(4)
                        .b(7)
                        .expected(3)
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void name() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getN(), aCase.getA(), aCase.getB()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}