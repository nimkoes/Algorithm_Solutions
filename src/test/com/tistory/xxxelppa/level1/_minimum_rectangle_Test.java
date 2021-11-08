package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("최소사각형")
class _minimum_rectangle_Test {

    @Builder
    @Getter
    static class TestCase {
        int[][] sizes;
        int expected;
    }

    _minimum_rectangle solution;

    @BeforeEach
    void setUp() {
        solution = new _minimum_rectangle();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .sizes(new int[][] {{60, 50}, {30, 70}, {60, 30}, {80, 40}})
                .expected(4000)
                .build();

        assertThat(solution.solution(testCase.getSizes()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .sizes(new int[][] {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}})
                .expected(120)
                .build();

        assertThat(solution.solution(testCase.getSizes()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .sizes(new int[][] {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}})
                .expected(133)
                .build();

        assertThat(solution.solution(testCase.getSizes()))
                .isEqualTo(testCase.getExpected());
    }
}
