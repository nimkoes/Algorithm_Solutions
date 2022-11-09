package com.nimkoes.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("행렬의 곱셈")
class _matrix_multiplication_test {

    @Builder
    @Getter
    static class TestCase {
        int[][] arr1;
        int[][] arr2;

        int[][] expected;
    }

    _matrix_multiplication solution;

    @BeforeEach
    void setUp() {
        solution = new _matrix_multiplication();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .arr1(new int[][]{{1, 4}, {3, 2}, {4, 1}})
                .arr2(new int[][]{{3, 3}, {3, 3}})
                .expected(new int[][]{{15, 15}, {15, 15}, {15, 15}})
                .build();

        assertThat(solution.solution(testCase.getArr1(), testCase.getArr2()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .arr1(new int[][]{{2, 3, 2}, {4, 2, 4}, {3, 1, 4}})
                .arr2(new int[][]{{5, 4, 3}, {2, 4, 1}, {3, 1, 1}})
                .expected(new int[][]{{22, 22, 11}, {36, 28, 18}, {29, 20, 14}})
                .build();

        assertThat(solution.solution(testCase.getArr1(), testCase.getArr2()))
                .isEqualTo(testCase.getExpected());
    }
}
