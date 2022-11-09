package com.nimkoes.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("최대공약수와 최소공배수")
class _greatest_common_divisor_and_least_common_multiple_test {

    @Builder
    @Getter
    static class TestCase {
        int n;
        int m;

        int[] expected;
    }

    _greatest_common_divisor_and_least_common_multiple solution;

    @BeforeEach
    void setUp() {
        solution = new _greatest_common_divisor_and_least_common_multiple();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(3)
                .m(12)
                .expected(new int[]{3, 12})
                .build();

        assertThat(solution.solution(testCase.getN(), testCase.getM()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(2)
                .m(5)
                .expected(new int[]{1, 10})
                .build();

        assertThat(solution.solution(testCase.getN(), testCase.getM()))
                .isEqualTo(testCase.getExpected());
    }
}
