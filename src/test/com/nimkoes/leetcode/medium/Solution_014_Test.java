package com.nimkoes.leetcode.medium;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("1823. Find the Winner of the Circular Game")
class Solution_014_Test {

    @Builder
    @Getter
    static class TestCase {
        int n;
        int k;
        int expected;
    }

    Solution_014 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_014();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(5)
                .k(2)
                .expected(3)
                .build();

        assertThat(solution.findTheWinner(testCase.getN(), testCase.getK()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(6)
                .k(5)
                .expected(1)
                .build();

        assertThat(solution.findTheWinner(testCase.getN(), testCase.getK()))
                .isEqualTo(testCase.getExpected());
    }
}
