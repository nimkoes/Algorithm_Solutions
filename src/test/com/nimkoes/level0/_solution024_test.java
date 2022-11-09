package com.nimkoes.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("편지")
class _solution024_test {

    @Builder
    @Getter
    static class TestCase {
        String message;
        int expected;
    }

    Solution_024 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_024();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .message("happy birthday!")
                .expected(30)
                .build();

        assertThat(solution.solution(testCase.getMessage()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .message("I love you~")
                .expected(22)
                .build();

        assertThat(solution.solution(testCase.getMessage()))
                .isEqualTo(testCase.getExpected());
    }
}
