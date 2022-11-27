package com.nimkoes.programmers.level0;

import com.nimkoes.programmers.level0.Solution_050;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("")
class Solution_050_test {

    @Builder
    @Getter
    static class TestCase {
        String my_string;
        String expected;
    }

    Solution_050 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_050();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .my_string("Bcad")
                .expected("abcd")
                .build();

        assertThat(solution.solution(testCase.getMy_string()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .my_string("heLLo")
                .expected("ehllo")
                .build();

        assertThat(solution.solution(testCase.getMy_string()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .my_string("Python")
                .expected("hnopty")
                .build();

        assertThat(solution.solution(testCase.getMy_string()))
                .isEqualTo(testCase.getExpected());
    }
}
