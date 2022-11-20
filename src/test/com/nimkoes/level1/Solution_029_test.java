package com.nimkoes.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("같은 숫자는 싫어")
class Solution_029_test {

    @Builder
    @Getter
    static class TestCase {
        int[] arr;

        int[] expected;
    }

    Solution_029 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_029();
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
