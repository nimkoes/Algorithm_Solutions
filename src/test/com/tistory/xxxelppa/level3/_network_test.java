package com.tistory.xxxelppa.level3;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

class _network_test {

    @Builder
    @Getter
    static class TestCase {
        int n;
        int[][] computers;

        int expected;
    }

    _network solution;

    @BeforeEach
    void setUp() {
        solution = new _network();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(3)
                .computers(new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}})
                .expected(2)
                .build();

        assertThat(solution.solution(testCase.getN(), testCase.getComputers()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(3)
                .computers(new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}})
                .expected(1)
                .build();

        assertThat(solution.solution(testCase.getN(), testCase.getComputers()))
                .isEqualTo(testCase.getExpected());
    }
}
