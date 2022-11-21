package com.nimkoes.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("방문 길이")
class Solution_052_test {

    @Builder
    @Getter
    static class TestCase {
        String dirs;

        int expected;
    }

    Solution_052 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_052();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .dirs("ULURRDLLU")
                .expected(7)
                .build();

        assertThat(solution.solution(testCase.getDirs()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .dirs("LULLLLLLU")
                .expected(7)
                .build();

        assertThat(solution.solution(testCase.getDirs()))
                .isEqualTo(testCase.getExpected());
    }
}
