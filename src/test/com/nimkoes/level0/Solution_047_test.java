package com.nimkoes.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("가장 큰 수 찾기")
class Solution_047_test {

    @Builder
    @Getter
    static class TestCase {
        int[] array;
        int[] expected;
    }

    Solution_047 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_047();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .array(new int[]{1, 8, 3})
                .expected(new int[]{8, 1})
                .build();

        assertThat(solution.solution(testCase.getArray()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .array(new int[]{9, 10, 11, 8})
                .expected(new int[]{11, 2})
                .build();

        assertThat(solution.solution(testCase.getArray()))
                .isEqualTo(testCase.getExpected());
    }
}
