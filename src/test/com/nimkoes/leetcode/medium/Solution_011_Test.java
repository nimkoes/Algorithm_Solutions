package com.nimkoes.leetcode.medium;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("2317. Maximum XOR After Operations")
class Solution_011_Test {

    @Builder
    @Getter
    static class TestCase {
        int[] nums;
        int expected;
    }

    Solution_011 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_011();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .nums(new int[]{3, 2, 4, 6})
                .expected(7)
                .build();

        assertThat(solution.maximumXOR(testCase.getNums()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .nums(new int[]{1, 2, 3, 9, 2})
                .expected(11)
                .build();

        assertThat(solution.maximumXOR(testCase.getNums()))
                .isEqualTo(testCase.getExpected());
    }
}
