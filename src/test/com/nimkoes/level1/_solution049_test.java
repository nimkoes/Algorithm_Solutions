package com.nimkoes.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("문자열 내 p와 y의 개수")
class _solution049_test {

    @Builder
    @Getter
    static class TestCase {
        String s;

        boolean expected;
    }

    Solution_049 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_049();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .s("pPoooyY")
                .expected(true)
                .build();

        assertThat(solution.solution(testCase.getS()))
                .isEqualTo(testCase.isExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .s("Pyy")
                .expected(false)
                .build();

        assertThat(solution.solution(testCase.getS()))
                .isEqualTo(testCase.isExpected());
    }
}
