package com.nimkoes.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("2차원으로 만들기")
class Solution_065_test {

    @Builder
    @Getter
    static class TestCase {
        int[] num_list;
        int n;
        int[][] expected;
    }

    Solution_065 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_065();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .num_list(new int[]{1, 2, 3, 4, 5, 6, 7, 8})
                .n(2)
                .expected(new int[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}})
                .build();

        assertThat(solution.solution(testCase.getNum_list(), testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .num_list(new int[]{100, 95, 2, 4, 5, 6, 18, 33, 948})
                .n(3)
                .expected(new int[][]{{100, 95, 2}, {4, 5, 6}, {18, 33, 948}})
                .build();

        assertThat(solution.solution(testCase.getNum_list(), testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }
}
