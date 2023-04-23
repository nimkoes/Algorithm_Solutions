
package com.nimkoes.leetcode.medium;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("1806. Minimum Number of Operations to Reinitialize a Permutation")
class Solution_016_Test {

    @Builder
    @Getter
    static class TestCase {
        int n;
        int expected;
    }

    Solution_016 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_016();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(2)
                .expected(1)
                .build();

        assertThat(solution.reinitializePermutation(testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(4)
                .expected(2)
                .build();

        assertThat(solution.reinitializePermutation(testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(6)
                .expected(4)
                .build();

        assertThat(solution.reinitializePermutation(testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }
}
