package com.nimkoes.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("등수 매기기")
class Solution_088_test {

    @Builder
    @Getter
    static class TestCase {
        int[][] score;
        int[] expected;
    }

    Solution_088 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_088();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .score(new int[][]{{80, 70}, {90, 50}, {40, 70}, {50, 80}})
                .expected(new int[]{1, 2, 4, 3})
                .build();

        assertThat(solution.solution(testCase.getScore()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .score(new int[][]{{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}})
                .expected(new int[]{4, 4, 6, 2, 2, 1, 7})
                .build();

        assertThat(solution.solution(testCase.getScore()))
                .isEqualTo(testCase.getExpected());
    }
}
