package com.nimkoes.programmers.level0;

import com.nimkoes.programmers.level0.Solution_090;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("특이한 정렬")
class Solution_090_test {

    @Builder
    @Getter
    static class TestCase {
        int[] numlist;
        int n;
        int[] expected;
    }

    Solution_090 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_090();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .numlist(new int[]{1, 2, 3, 4, 5, 6})
                .n(4)
                .expected(new int[]{4, 5, 3, 6, 2, 1})
                .build();

        assertThat(solution.solution(testCase.getNumlist(), testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .numlist(new int[]{10000, 20, 36, 47, 40, 6, 10, 7000})
                .n(30)
                .expected(new int[]{36, 40, 20, 47, 10, 6, 7000, 10000})
                .build();

        assertThat(solution.solution(testCase.getNumlist(), testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }
}
