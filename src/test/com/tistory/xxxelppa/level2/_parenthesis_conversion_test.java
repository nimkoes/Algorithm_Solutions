package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("괄호 변환")
class _parenthesis_conversion_test {

    @Builder
    @Getter
    static class TestCase {
        String p;

        String expected;
    }

    _parenthesis_conversion solution;

    @BeforeEach
    void setUp() {
        solution = new _parenthesis_conversion();
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