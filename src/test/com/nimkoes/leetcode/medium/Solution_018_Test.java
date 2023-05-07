
package com.nimkoes.leetcode.medium;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("2527. Find Xor-Beauty of Array")
class Solution_018_Test {

    @Builder
    @Getter
    static class TestCase {
        int[] nums;

        int expected;
    }

    Solution_018 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_018();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .nums(new int[]{1, 4})
                .expected(5)
                .build();

        assertEquals(solution.xorBeauty(testCase.getNums())
                , testCase.getExpected());

    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .nums(new int[]{15, 45, 20, 2, 34, 35, 5, 44, 32, 30})
                .expected(34)
                .build();

        assertEquals(solution.xorBeauty(testCase.getNums())
                , testCase.getExpected());
    }
}
