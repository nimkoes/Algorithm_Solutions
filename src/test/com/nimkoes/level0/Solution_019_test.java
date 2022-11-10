package com.nimkoes.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("배열 뒤집기")
class Solution_019_test {

    @Builder
    @Getter
    static class TestCase {
        int[] num_list;
        int[] expected;
    }

    Solution_019 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_019();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .num_list(new int[]{1, 2, 3, 4, 5})
                .expected(new int[]{5, 4, 3, 2, 1})
                .build();

        assertThat(solution.solution(testCase.getNum_list()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .num_list(new int[]{1, 1, 1, 1, 1, 2})
                .expected(new int[]{2, 1, 1, 1, 1, 1})
                .build();

        assertThat(solution.solution(testCase.getNum_list()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .num_list(new int[]{1, 0, 1, 1, 1, 3, 5})
                .expected(new int[]{5, 3, 1, 1, 1, 0, 1})
                .build();

        assertThat(solution.solution(testCase.getNum_list()))
                .isEqualTo(testCase.getExpected());
    }
}
