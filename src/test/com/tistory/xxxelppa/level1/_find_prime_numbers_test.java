package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("소수 찾기")
class _find_prime_numbers_test {

    @Builder
    @Getter
    static class TestCase {
        int n;

        int expected;
    }

    _find_prime_numbers solution;

    @BeforeEach
    void setUp() {
        solution = new _find_prime_numbers();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(10)
                .expected(4)
                .build();

        assertThat(solution.solution(testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(5)
                .expected(3)
                .build();

        assertThat(solution.solution(testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }
}
