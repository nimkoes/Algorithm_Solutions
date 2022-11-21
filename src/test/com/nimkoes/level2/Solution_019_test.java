package com.nimkoes.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("괄호 변환")
class Solution_019_test {

    @Builder
    @Getter
    static class TestCase {
        String p;

        String expected;
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
                .p("(()())()")
                .expected("(()())()")
                .build();

        assertThat(solution.solution(testCase.getP()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .p(")(")
                .expected("()")
                .build();

        assertThat(solution.solution(testCase.getP()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .p("()))((()")
                .expected("()(())()")
                .build();

        assertThat(solution.solution(testCase.getP()))
                .isEqualTo(testCase.getExpected());
    }
}
