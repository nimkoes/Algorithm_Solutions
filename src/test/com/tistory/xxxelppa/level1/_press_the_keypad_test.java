package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("키패드 누르기")
class _press_the_keypad_test {

    @Builder
    @Getter
    static class TestCase {
        int[] numbers;
        String hand;

        String expected;
    }

    _press_the_keypad solution;

    @BeforeEach
    void setUp() {
        solution = new _press_the_keypad();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .numbers(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5})
                .hand("right")
                .expected("LRLLLRLLRRL")
                .build();

        assertThat(solution.solution(testCase.getNumbers(), testCase.getHand()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .numbers(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2})
                .hand("left")
                .expected("LRLLRRLLLRR")
                .build();

        assertThat(solution.solution(testCase.getNumbers(), testCase.getHand()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .numbers(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0})
                .hand("right")
                .expected("LLRLLRLLRL")
                .build();

        assertThat(solution.solution(testCase.getNumbers(), testCase.getHand()))
                .isEqualTo(testCase.getExpected());
    }
}
