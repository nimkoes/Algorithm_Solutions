package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("자릿수 더하기")
class _add_the_number_of_digits_test {

    @Builder
    @Getter
    static class TestCase {
        int n;

        int expected;
    }

    _add_the_number_of_digits solution;

    @BeforeEach
    void setUp() {
        solution = new _add_the_number_of_digits();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(123)
                .expected(6)
                .build();

        assertThat(solution.solution(testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(987)
                .expected(24)
                .build();

        assertThat(solution.solution(testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }
}
