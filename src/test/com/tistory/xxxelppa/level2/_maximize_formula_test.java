package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("수식 최대회")
class _maximize_formula_test {

    @Builder
    @Getter
    static class TestCase {
        String expression;

        long expected;
    }

    _maximize_formula solution;

    @BeforeEach
    void setUp() {
        solution = new _maximize_formula();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .expression("100-200*300-500+20")
                .expected(60420)
                .build();

        assertThat(solution.solution((testCase.getExpression())))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .expression("50*6-3*2")
                .expected(300)
                .build();

        assertThat(solution.solution((testCase.getExpression())))
                .isEqualTo(testCase.getExpected());
    }
}