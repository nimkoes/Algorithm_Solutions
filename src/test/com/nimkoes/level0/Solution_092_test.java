package com.nimkoes.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("최빈값 구하기")
class Solution_092_test {

    @Builder
    @Getter
    static class TestCase {
        int[] array;
        int expected;
    }

    Solution_092 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_092();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .array(new int[]{1, 2, 3, 3, 3, 4})
                .expected(3)
                .build();

        assertThat(solution.solution(testCase.getArray()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .array(new int[]{1, 1, 2, 2})
                .expected(-1)
                .build();

        assertThat(solution.solution(testCase.getArray()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .array(new int[]{1})
                .expected(1)
                .build();

        assertThat(solution.solution(testCase.getArray()))
                .isEqualTo(testCase.getExpected());
    }
}
