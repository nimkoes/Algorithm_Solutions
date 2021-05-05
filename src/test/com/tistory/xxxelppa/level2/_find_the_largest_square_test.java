package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("가장 큰 정사각형 찾기")
class _find_the_largest_square_test {
    
    @Builder
    @Getter
    static class TestCase {
        int[][] board;
        
        int expected;
    }
    
    _find_the_largest_square solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _find_the_largest_square();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .board(new int[][]{{0, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 1, 0}})
                        .expected(9)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .board(new int[][]{{0, 0, 1, 1}, {1, 1, 1, 1}})
                        .expected(4)
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void name() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getBoard()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}