package com.nimkoes.programmers.level0;

import com.nimkoes.programmers.level0.Solution_021;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("피자 나눠 먹기 (3)")
class Solution_021_test {

    @Builder
    @Getter
    static class TestCase {
        int slice;
        int n;
        int expected;
    }

    Solution_021 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_021();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .slice(7)
                .n(10)
                .expected(2)
                .build();

        assertThat(solution.solution(testCase.getSlice(), testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .slice(4)
                .n(12)
                .expected(3)
                .build();

        assertThat(solution.solution(testCase.getSlice(), testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }
}
