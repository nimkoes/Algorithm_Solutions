package com.nimkoes.programmers.level1;

import com.nimkoes.programmers.level1.Solution_050;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("두 정수 사이의 합")
class Solution_050_test {

    @Builder
    @Getter
    static class TestCase {
        int a;
        int b;

        long expected;
    }

    Solution_050 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_050();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .a(3)
                .b(5)
                .expected(12)
                .build();

        assertThat(solution.solution(testCase.getA(), testCase.getB()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .a(3)
                .b(3)
                .expected(3)
                .build();

        assertThat(solution.solution(testCase.getA(), testCase.getB()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .a(5)
                .b(3)
                .expected(12)
                .build();

        assertThat(solution.solution(testCase.getA(), testCase.getB()))
                .isEqualTo(testCase.getExpected());
    }
}
