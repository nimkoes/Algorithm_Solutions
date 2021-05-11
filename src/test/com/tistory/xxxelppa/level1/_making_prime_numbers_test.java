package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("소수 만들기")
class _making_prime_numbers_test {

    @Builder
    @Getter
    static class TestCase {
        int[] nums;

        int expected;
    }

    _making_prime_numbers solution;

    @BeforeEach
    void setUp() {
        solution = new _making_prime_numbers();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .nums(new int[]{1, 2, 3, 4})
                .expected(1)
                .build();

        assertThat(solution.solution(testCase.getNums()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .nums(new int[]{1, 2, 7, 6, 4})
                .expected(4)
                .build();

        assertThat(solution.solution(testCase.getNums()))
                .isEqualTo(testCase.getExpected());
    }
}
