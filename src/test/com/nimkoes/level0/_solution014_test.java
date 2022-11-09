package com.nimkoes.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("두 수의 나눗셈")
class _solution014_test {

    @Builder
    @Getter
    static class TestCase {
        int[] array;
        int height;
        int expected;
    }

    Solution_014 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_014();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .array(new int[]{149, 180, 192, 170})
                .height(167)
                .expected(3)
                .build();

        assertThat(solution.solution(testCase.getArray(), testCase.getHeight()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .array(new int[]{180, 120, 140})
                .height(190)
                .expected(0)
                .build();

        assertThat(solution.solution(testCase.getArray(), testCase.getHeight()))
                .isEqualTo(testCase.getExpected());
    }
}
