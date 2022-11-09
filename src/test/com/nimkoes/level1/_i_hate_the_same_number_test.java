package com.nimkoes.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("같은 숫자는 싫어")
class _i_hate_the_same_number_test {

    @Builder
    @Getter
    static class TestCase {
        int[] arr;

        int[] expected;
    }

    _i_hate_the_same_number solution;

    @BeforeEach
    void setUp() {
        solution = new _i_hate_the_same_number();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .arr(new int[]{1, 1, 3, 3, 0, 1, 1})
                .expected(new int[]{1, 3, 0, 1})
                .build();

        assertThat(solution.solution(testCase.getArr()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .arr(new int[]{4, 4, 4, 3, 3})
                .expected(new int[]{4, 3})
                .build();

        assertThat(solution.solution(testCase.getArr()))
                .isEqualTo(testCase.getExpected());
    }
}
