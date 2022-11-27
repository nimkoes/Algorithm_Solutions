package com.nimkoes.programmers.level1;

import com.nimkoes.programmers.level1.Solution_015;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("다트 게임")
class Solution_015_test {

    @Builder
    @Getter
    static class TestCase {
        String dartResult;

        int expected;
    }

    Solution_015 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_015();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .dartResult("1S2D*3T")
                .expected(37)
                .build();

        assertThat(solution.solution(testCase.getDartResult()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .dartResult("1D2S#10S")
                .expected(9)
                .build();

        assertThat(solution.solution(testCase.getDartResult()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .dartResult("1D2S0T")
                .expected(3)
                .build();

        assertThat(solution.solution(testCase.getDartResult()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 4")
    void test_04() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .dartResult("1S*2T*3S")
                .expected(23)
                .build();

        assertThat(solution.solution(testCase.getDartResult()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 5")
    void test_05() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .dartResult("1D#2S*3S")
                .expected(5)
                .build();

        assertThat(solution.solution(testCase.getDartResult()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 6")
    void test_06() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .dartResult("1T2D3D#")
                .expected(-4)
                .build();

        assertThat(solution.solution(testCase.getDartResult()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 7")
    void test_07() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .dartResult("1D2S3T*")
                .expected(59)
                .build();

        assertThat(solution.solution(testCase.getDartResult()))
                .isEqualTo(testCase.getExpected());
    }
}
