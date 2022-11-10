package com.nimkoes.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("문자열안에 문자열")
class Solution_032_test {

    @Builder
    @Getter
    static class TestCase {
        String str1;
        String str2;
        int expected;
    }

    Solution_032 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_032();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .str1("ab6CDE443fgh22iJKlmn1o")
                .str2("6CD")
                .expected(1)
                .build();

        assertThat(solution.solution(testCase.getStr1(), testCase.getStr2()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .str1("ppprrrogrammers")
                .str2("pppp")
                .expected(2)
                .build();

        assertThat(solution.solution(testCase.getStr1(), testCase.getStr2()))
                .isEqualTo(testCase.getExpected());
    }
}
