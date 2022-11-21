package com.nimkoes.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("가장 큰 정사각형 찾기")
class Solution_037_test {

    @Builder
    @Getter
    static class TestCase {
        int[][] board;

        int expected;
    }

    Solution_037 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_037();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .board(new int[][]{{0, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 1, 0}})
                .expected(9)
                .build();

        assertThat(solution.solution(testCase.getBoard()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .board(new int[][]{{0, 0, 1, 1}, {1, 1, 1, 1}})
                .expected(4)
                .build();

        assertThat(solution.solution(testCase.getBoard()))
                .isEqualTo(testCase.getExpected());
    }
}
