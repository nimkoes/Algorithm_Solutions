package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("괄호 변환")
class _parenthesis_conversion_test {
    
    @Builder
    @Getter
    static class TestCase {
        String p;
        
        String expected;
    }
    
    _parenthesis_conversion solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _parenthesis_conversion();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .p("(()())()")
                        .expected("(()())()")
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .p(")(")
                        .expected("()")
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .p("()))((()")
                        .expected("()(())()")
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void name() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getP()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}