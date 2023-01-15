package com.nimkoes.programmers.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("콜라 문제")
class Solution_057_test {

    @Builder
    @Getter
    static class TestCase {
        int a;
        int b;
        int n;

        int expected;
    }

    Solution_057 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_057();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .a(2)
                .b(1)
                .n(20)
                .expected(19)
                .build();

        assertThat(solution.solution(testCase.getA(), testCase.getB(), testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .a(3)
                .b(1)
                .n(20)
                .expected(9)
                .build();

        assertThat(solution.solution(testCase.getA(), testCase.getB(), testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }
}
