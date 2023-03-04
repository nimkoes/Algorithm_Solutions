package com.nimkoes.leetcode.medium;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


@DisplayName("1828. Queries on Number of Points Inside a Circle\n")
class Solution_001_test {

    @Builder
    @Getter
    static class TestCase {
        int[][] points;
        int[][] queries;
        int[] expected;
    }

    Solution_009 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_009();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .points(new int[][]{{1, 3}, {3, 3}, {5, 3}, {2, 2}})
                .queries(new int[][]{{2, 3, 1}, {4, 3, 1}, {1, 1, 2}})
                .expected(new int[]{3, 2, 2})
                .build();

        assertThat(solution.countPoints(testCase.getPoints(), testCase.getQueries()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .points(new int[][]{{1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}})
                .queries(new int[][]{{1, 2, 2}, {2, 2, 2}, {4, 3, 2}, {4, 3, 3}})
                .expected(new int[]{2, 3, 2, 4})
                .build();

        assertThat(solution.countPoints(testCase.getPoints(), testCase.getQueries()))
                .isEqualTo(testCase.getExpected());
    }
}
