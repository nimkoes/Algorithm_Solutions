package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("2016년")
class _2016_Test {
    
    @Builder
    @Getter
    static class TestCase {
        int a;
        int b;
        
        String expected;
    }
    
    _2016 solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _2016();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .a(5)
                        .b(24)
                        .expected("TUE")
                        .build()
        );
        
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void solution() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getA(), aCase.getB()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}