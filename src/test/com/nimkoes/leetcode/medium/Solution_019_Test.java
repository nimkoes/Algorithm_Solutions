
package com.nimkoes.leetcode.medium;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("877. Stone Game")
class Solution_019_Test {

    @Builder
    @Getter
    static class TestCase {
        int[] piles;

        boolean expected;
    }

    Solution_019 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_019();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .piles(new int[]{5, 3, 4, 5})
                .expected(true)
                .build();

        assertEquals(solution.stoneGame(testCase.getPiles()), testCase.isExpected());

    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .piles(new int[]{3, 7, 2, 3})
                .expected(true)
                .build();

        assertEquals(solution.stoneGame(testCase.getPiles()), testCase.isExpected());
    }
}
