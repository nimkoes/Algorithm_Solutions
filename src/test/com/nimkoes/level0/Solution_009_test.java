package com.nimkoes.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("각도기")
class Solution_009_test {

    @Builder
    @Getter
    static class TestCase {
        int angle;
        int expected;
    }

    Solution_009 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_009();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .angle(70)
                .expected(1)
                .build();

        assertThat(solution.solution(testCase.getAngle()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .angle(91)
                .expected(3)
                .build();

        assertThat(solution.solution(testCase.getAngle()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .angle(180)
                .expected(4)
                .build();

        assertThat(solution.solution(testCase.getAngle()))
                .isEqualTo(testCase.getExpected());
    }
}
