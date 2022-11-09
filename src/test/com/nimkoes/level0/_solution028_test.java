package com.nimkoes.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("특정 문자 제거하기")
class _solution028_test {

    @Builder
    @Getter
    static class TestCase {
        String my_string;
        String letter;
        String expected;
    }

    Solution_028 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_028();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .my_string("abcdef")
                .letter("f")
                .expected("abcde")
                .build();

        assertThat(solution.solution(testCase.getMy_string(), testCase.getLetter()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .my_string("BCBdbe")
                .letter("B")
                .expected("Cdbe")
                .build();

        assertThat(solution.solution(testCase.getMy_string(), testCase.getLetter()))
                .isEqualTo(testCase.getExpected());
    }
}
