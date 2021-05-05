package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("올바른 괄호")
class _correct_parenthesis_test {
    
    @Builder
    @Getter
    static class TestCase {
        String s;
        
        boolean expected;
    }
    
    _correct_parenthesis solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _correct_parenthesis();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .s("()()")
                        .expected(true)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .s("(())()")
                        .expected(true)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .s(")()(")
                        .expected(false)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .s("(()(")
                        .expected(false)
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void name() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getS()))
                    .isEqualTo(aCase.isExpected());
        }
    }
}