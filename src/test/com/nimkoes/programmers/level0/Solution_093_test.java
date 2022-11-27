package com.nimkoes.programmers.level0;

import com.nimkoes.programmers.level0.Solution_093;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("다음에 올 숫자")
class Solution_093_test {

    @Builder
    @Getter
    static class TestCase {
        int[] common;
        int expected;
    }

    Solution_093 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_093();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .common(new int[]{1, 2, 3, 4})
                .expected(5)
                .build();

        assertThat(solution.solution(testCase.getCommon()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .common(new int[]{2, 4, 8})
                .expected(16)
                .build();

        assertThat(solution.solution(testCase.getCommon()))
                .isEqualTo(testCase.getExpected());
    }
}
