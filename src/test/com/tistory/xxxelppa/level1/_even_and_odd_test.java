package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("짝수와 홀수")
class _even_and_odd_test {

    @Builder
    @Getter
    static class TestCase {
        int num;

        String expected;
    }

    _even_and_odd solution;

    @BeforeEach
    void setUp() {
        solution = new _even_and_odd();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .num(3)
                .expected("Odd")
                .build();

        assertThat(solution.solution(testCase.getNum()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .num(4)
                .expected("Even")
                .build();

        assertThat(solution.solution(testCase.getNum()))
                .isEqualTo(testCase.getExpected());
    }
}
