package com.nimkoes.leetcode.medium;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("1561. Maximum Number of Coins You Can Get")
class Solution_010_test {

    @Builder
    @Getter
    static class TestCase {
        int[] piles;
        int expected;
    }

    Solution_010 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_010();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .piles(new int[]{2, 4, 1, 2, 7, 8})
                .expected(9)
                .build();

        assertThat(solution.maxCoins(testCase.getPiles()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .piles(new int[]{2, 4, 5})
                .expected(4)
                .build();

        assertThat(solution.maxCoins(testCase.getPiles()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .piles(new int[]{9, 8, 7, 6, 5, 1, 2, 3, 4})
                .expected(18)
                .build();

        assertThat(solution.maxCoins(testCase.getPiles()))
                .isEqualTo(testCase.getExpected());
    }
}