package com.nimkoes.leetcode.medium;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("2442. Count Number of Distinct Integers After Reverse Operations")
class Solution_012_Test {

    @Builder
    @Getter
    static class TestCase {
        int[] nums;
        int[] expected;
    }

    Solution_012 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_012();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .nums(new int[]{1, 13, 10, 12, 31})
                .expected(new int[]{1, 13, 10, 12, 31, 1, 31, 1, 21, 13})
                .build();

        assertThat(solution.countDistinctIntegers(testCase.getNums()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .nums(new int[]{2, 2, 2})
                .expected(new int[]{2, 2, 2, 2, 2, 2})
                .build();

        assertThat(solution.countDistinctIntegers(testCase.getNums()))
                .isEqualTo(testCase.getExpected());
    }
}
