package com.nimkoes.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("카펫")
class _carpet_test {

    @Builder
    @Getter
    static class TestCase {
        int brown;
        int yellow;

        int[] expected;
    }

    _carpet solution;

    @BeforeEach
    void setUp() {
        solution = new _carpet();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .brown(10)
                .yellow(2)
                .expected(new int[]{4, 3})
                .build();

        assertThat(solution.solution(testCase.getBrown(), testCase.getYellow()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .brown(8)
                .yellow(1)
                .expected(new int[]{3, 3})
                .build();

        assertThat(solution.solution(testCase.getBrown(), testCase.getYellow()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .brown(24)
                .yellow(24)
                .expected(new int[]{8, 6})
                .build();

        assertThat(solution.solution(testCase.getBrown(), testCase.getYellow()))
                .isEqualTo(testCase.getExpected());
    }
}
