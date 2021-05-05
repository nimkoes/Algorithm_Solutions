package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("삼각 달팽이")
class _triangular_snail_test {
    
    @Builder
    @Getter
    static class TestCase {
        int n;
        
        int[] expected;
    }
    
    _triangular_snail solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _triangular_snail();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .n(4)
                        .expected(new int[]{1, 2, 9, 3, 10, 8, 4, 5, 6, 7})
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .n(5)
                        .expected(new int[]{1, 2, 12, 3, 13, 11, 4, 14, 15, 10, 5, 6, 7, 8, 9})
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .n(6)
                        .expected(new int[]{1, 2, 15, 3, 16, 14, 4, 17, 21, 13, 5, 18, 19, 20, 12, 6, 7, 8, 9, 10, 11})
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void name() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getN()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}