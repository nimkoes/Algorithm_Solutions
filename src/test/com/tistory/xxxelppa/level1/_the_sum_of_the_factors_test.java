package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("약수의 합")
class _the_sum_of_the_factors_test {

    @Builder
    @Getter
    static class TestCase {
        int n;

        int expected;
    }

    _the_sum_of_the_factors solution;

    @BeforeEach
    void setUp() {
        solution = new _the_sum_of_the_factors();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(12)
                .expected(28)
                .build();

        assertThat(solution.solution(testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(5)
                .expected(6)
                .build();

        assertThat(solution.solution(testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }
}
