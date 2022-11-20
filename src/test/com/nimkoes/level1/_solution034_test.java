package com.nimkoes.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("행렬의 덧셈")
class _solution034_test {

    @Builder
    @Getter
    static class TestCase {
        int[][] arr1;
        int[][] arr2;

        int[][] expected;
    }

    Solution_034 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_034();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .arr1(new int[][]{{1, 2}, {2, 3}})
                .arr2(new int[][]{{3, 4}, {5, 6}})
                .expected(new int[][]{{4, 6}, {7, 9}})
                .build();

        assertThat(solution.solution(testCase.getArr1(), testCase.getArr2()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .arr1(new int[][]{{1}, {2}})
                .arr2(new int[][]{{3}, {4}})
                .expected(new int[][]{{4}, {6}})
                .build();

        assertThat(solution.solution(testCase.getArr1(), testCase.getArr2()))
                .isEqualTo(testCase.getExpected());
    }
}
