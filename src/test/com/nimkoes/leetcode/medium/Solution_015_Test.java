
package com.nimkoes.leetcode.medium;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("1442. Count Triplets That Can Form Two Arrays of Equal XOR")
class Solution_015_Test {

    @Builder
    @Getter
    static class TestCase {
        int[] arr;
        int expected;
    }

    Solution_015 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_015();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .arr(new int[]{2, 3, 1, 6, 7})
                .expected(4)
                .build();

        assertThat(solution.countTriplets(testCase.getArr()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .arr(new int[]{1, 1, 1, 1, 1})
                .expected(10)
                .build();

        assertThat(solution.countTriplets(testCase.getArr()))
                .isEqualTo(testCase.getExpected());
    }
}
