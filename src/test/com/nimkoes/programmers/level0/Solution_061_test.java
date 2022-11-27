package com.nimkoes.programmers.level0;

import com.nimkoes.programmers.level0.Solution_061;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("모스부호 (1)")
class Solution_061_test {

    @Builder
    @Getter
    static class TestCase {
        String letter;
        String expected;
    }

    Solution_061 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_061();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .letter(".... . .-.. .-.. ---")
                .expected("hello")
                .build();

        assertThat(solution.solution(testCase.getLetter()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .letter(".--. -.-- - .... --- -.")
                .expected("python")
                .build();

        assertThat(solution.solution(testCase.getLetter()))
                .isEqualTo(testCase.getExpected());
    }
}
