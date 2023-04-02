package com.nimkoes.leetcode.medium;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("2221. Find Triangular Sum of an Array")
class Solution_013_Test {

    @Builder
    @Getter
    static class TestCase {
        int[] nums;
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
                .nums(new int[]{1, 2, 3, 4, 5})
                .expected(8)
                .build();

        assertThat(solution.triangularSum(testCase.getNums()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .nums(new int[]{5})
                .expected(5)
                .build();

        assertThat(solution.triangularSum(testCase.getNums()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .nums(new int[]{0, 3, 3, 4, 1, 2, 6, 4, 9, 3, 5, 1, 7, 7, 3, 0, 3, 2, 5, 1, 9, 0, 2, 6, 3, 9, 2, 5, 9, 2, 6, 4, 2, 9, 7, 2, 0, 3, 0, 1, 1, 2, 7, 8, 6, 4, 4, 5})
                .expected(5)
                .build();

        assertThat(solution.triangularSum(testCase.getNums()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 4")
    void test_04() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .nums(new int[]{5, 3, 5, 1, 7, 2, 6, 6, 4, 0, 4, 6, 4, 3, 1, 4, 0, 8, 2, 4, 3, 4, 9, 0, 5, 5, 0, 4, 6, 0, 6, 3, 4, 2, 2, 7, 3, 8, 1, 0, 5, 3, 1, 9, 0, 2, 2, 5, 8, 6, 2, 3, 2, 3, 5, 8, 5, 4, 1, 2, 0, 9, 3, 4, 4, 4, 1, 5, 1, 9, 2, 0, 8, 4, 3, 2, 4, 1, 9, 2, 4, 9, 2, 0, 1, 2, 3, 3, 8, 6, 0, 7, 3, 5, 7, 7, 9, 2, 5, 3, 2, 3, 4, 9, 3, 3, 5, 3, 4, 0, 7, 2, 1, 2, 5, 0, 5, 0, 6, 9, 7, 6, 5, 3, 2, 9, 8, 9, 4, 1, 8, 4, 8, 3, 7, 2, 2, 0, 1, 2, 3, 2, 2, 5, 8, 0, 1, 1, 3, 3, 3, 8, 4, 5, 6, 2, 6, 5, 7, 0, 4, 6, 6, 2, 2, 6, 7, 6, 1, 2, 7, 7, 6, 0, 4, 9, 9, 8, 1, 8, 3, 3, 5, 4, 5, 0, 9, 4, 0, 8, 6, 3, 7, 1, 8, 3, 4, 6, 6, 1})
                .expected(2)
                .build();

        assertThat(solution.triangularSum(testCase.getNums()))
                .isEqualTo(testCase.getExpected());
    }
}
