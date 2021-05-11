package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("음양 더하기")
class _adding_minus_and_plus_test {

    @Builder
    @Getter
    static class TestCase {
        int[] absolutes;
        boolean[] signs;

        int expected;
    }

    _adding_minus_and_plus solution;

    @BeforeEach
    void setUp() {
        solution = new _adding_minus_and_plus();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .absolutes(new int[]{4, 7, 12})
                .signs(new boolean[]{true, false, true})
                .expected(9)
                .build();

        assertThat(solution.solution(testCase.getAbsolutes(), testCase.getSigns()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .absolutes(new int[]{1, 2, 3})
                .signs(new boolean[]{false, false, true})
                .expected(0)
                .build();

        assertThat(solution.solution(testCase.getAbsolutes(), testCase.getSigns()))
                .isEqualTo(testCase.getExpected());
    }
}
