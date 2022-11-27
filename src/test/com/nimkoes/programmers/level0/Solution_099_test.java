package com.nimkoes.programmers.level0;

import com.nimkoes.programmers.level0.Solution_099;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("겹치는 선분의 길이")
class Solution_099_test {

    @Builder
    @Getter
    static class TestCase {
        int[][] lines;
        int expected;
    }

    Solution_099 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_099();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .lines(new int[][]{{0, 1}, {2, 5}, {3, 9}})
                .expected(2)
                .build();

        assertThat(solution.solution(testCase.getLines()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .lines(new int[][]{{-1, 1}, {1, 3}, {3, 9}})
                .expected(0)
                .build();

        assertThat(solution.solution(testCase.getLines()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .lines(new int[][]{{0, 5}, {3, 9}, {1, 10}})
                .expected(8)
                .build();

        assertThat(solution.solution(testCase.getLines()))
                .isEqualTo(testCase.getExpected());
    }
}
