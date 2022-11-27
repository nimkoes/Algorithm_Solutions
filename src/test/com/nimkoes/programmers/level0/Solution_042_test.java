package com.nimkoes.programmers.level0;

import com.nimkoes.programmers.level0.Solution_042;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("문자열 정렬하기 (1)")
class Solution_042_test {

    @Builder
    @Getter
    static class TestCase {
        String my_string;
        int[] expected;
    }

    Solution_042 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_042();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .my_string("hi12392")
                .expected(new int[]{1, 2, 2, 3, 9})
                .build();

        assertThat(solution.solution(testCase.getMy_string()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .my_string("p2o4i8gj2")
                .expected(new int[]{2, 2, 4, 8})
                .build();

        assertThat(solution.solution(testCase.getMy_string()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .my_string("abcde0")
                .expected(new int[]{0})
                .build();

        assertThat(solution.solution(testCase.getMy_string()))
                .isEqualTo(testCase.getExpected());
    }
}
