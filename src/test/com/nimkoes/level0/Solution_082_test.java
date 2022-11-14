package com.nimkoes.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("삼각형의 완성조건 (2)")
class Solution_082_test {

    @Builder
    @Getter
    static class TestCase {
        int[] sides;
        int expected;
    }

    Solution_082 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_082();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .sides(new int[]{1, 2})
                .expected(1)
                .build();

        assertThat(solution.solution(testCase.getSides()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .sides(new int[]{3, 6})
                .expected(5)
                .build();

        assertThat(solution.solution(testCase.getSides()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .sides(new int[]{11, 7})
                .expected(13)
                .build();

        assertThat(solution.solution(testCase.getSides()))
                .isEqualTo(testCase.getExpected());
    }
}
