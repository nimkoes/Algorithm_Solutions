package com.nimkoes.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("캐릭터의 좌표")
class Solution_081_test {

    @Builder
    @Getter
    static class TestCase {
        String[] keyinput;
        int[] board;
        int[] expected;
    }

    Solution_081 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_081();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .keyinput(new String[]{"left", "right", "up", "right", "right"})
                .board(new int[]{11, 11})
                .expected(new int[]{2, 1})
                .build();

        assertThat(solution.solution(testCase.getKeyinput(), testCase.getBoard()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .keyinput(new String[]{"down", "down", "down", "down", "down"})
                .board(new int[]{7, 9})
                .expected(new int[]{0, -4})
                .build();

        assertThat(solution.solution(testCase.getKeyinput(), testCase.getBoard()))
                .isEqualTo(testCase.getExpected());
    }
}
