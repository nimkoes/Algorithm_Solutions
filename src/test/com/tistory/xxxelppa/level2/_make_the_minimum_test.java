package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("최솟값 만들기")
class _make_the_minimum_test {
    
    @Builder
    @Getter
    static class TestCase {
        int[] A;
        int[] B;
        
        int expected;
    }
    
    _make_the_minimum solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _make_the_minimum();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .A(new int[]{1, 4, 2})
                        .B(new int[]{5, 4, 4})
                        .expected(29)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .A(new int[]{1, 2})
                        .B(new int[]{3, 4})
                        .expected(10)
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void name() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getA(), aCase.getB()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}