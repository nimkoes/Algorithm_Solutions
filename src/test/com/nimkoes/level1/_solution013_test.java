package com.nimkoes.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


@DisplayName("크레인 인형뽑기 게임")
class _solution013_test {

    @Builder
    @Getter
    static class TestCase {
        int[][] board;
        int[] moves;

        int expected;
    }

    Solution_013 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_013();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .board(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}})
                .moves(new int[]{1, 5, 3, 5, 1, 2, 1, 4})
                .expected(4)
                .build();

        assertThat(solution.solution(testCase.getBoard(), testCase.getMoves()))
                .isEqualTo(testCase.getExpected());
    }
}
