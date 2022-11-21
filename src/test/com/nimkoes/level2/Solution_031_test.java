package com.nimkoes.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("영어 끝말잇기")
class Solution_031_test {

    @Builder
    @Getter
    static class TestCase {
        int n;
        String[] words;

        int[] expected;
    }

    Solution_031 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_031();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(3)
                .words(new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"})
                .expected(new int[]{3, 3})
                .build();

        assertThat(solution.solution(testCase.getN(), testCase.getWords()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(5)
                .words(new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"})
                .expected(new int[]{0, 0})
                .build();

        assertThat(solution.solution(testCase.getN(), testCase.getWords()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(2)
                .words(new String[]{"hello", "one", "even", "never", "now", "world", "draw"})
                .expected(new int[]{1, 3})
                .build();

        assertThat(solution.solution(testCase.getN(), testCase.getWords()))
                .isEqualTo(testCase.getExpected());
    }
}
