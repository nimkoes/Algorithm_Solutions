package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("수식 최대회")
class _maximize_formula_test {
    
    @Builder
    @Getter
    static class TestCase {
        String expression;
        
        long expected;
    }
    
    _maximize_formula solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _maximize_formula();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .expression("100-200*300-500+20")
                        .expected(60420)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .expression("50*6-3*2")
                        .expected(300)
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void name() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution((aCase.getExpression())))
                    .isEqualTo(aCase.getExpected());
        }
    }
}