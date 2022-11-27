package com.nimkoes.programmers.level0;

import com.nimkoes.programmers.level0.Solution_041;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("개미 군단")
class Solution_041_test {

    @Builder
    @Getter
    static class TestCase {
        int hp;
        int expected;
    }

    Solution_041 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_041();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .hp(23)
                .expected(5)
                .build();

        assertThat(solution.solution(testCase.getHp()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .hp(24)
                .expected(6)
                .build();

        assertThat(solution.solution(testCase.getHp()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .hp(999)
                .expected(201)
                .build();

        assertThat(solution.solution(testCase.getHp()))
                .isEqualTo(testCase.getExpected());
    }
}
