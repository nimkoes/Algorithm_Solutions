package com.nimkoes.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("평행")
class Solution_100_test {

    @Builder
    @Getter
    static class TestCase {
        int[][] dots;
        int expected;
    }

    Solution_100 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_100();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .dots(new int[][]{{1, 4}, {9, 2}, {3, 8}, {11, 6}})
                .expected(1)
                .build();

        assertThat(solution.solution(testCase.getDots()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .dots(new int[][]{{3, 5}, {4, 1}, {2, 4}, {5, 10}})
                .expected(0)
                .build();

        assertThat(solution.solution(testCase.getDots()))
                .isEqualTo(testCase.getExpected());
    }
}
