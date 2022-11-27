package com.nimkoes.programmers.level0;

import com.nimkoes.programmers.level0.Solution_076;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("영어가 싫어요")
class Solution_076_test {

    @Builder
    @Getter
    static class TestCase {
        String numbers;
        long expected;
    }

    Solution_076 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_076();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .numbers("onetwothreefourfivesixseveneightnine")
                .expected(123456789)
                .build();

        assertThat(solution.solution(testCase.getNumbers()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .numbers("onefourzerosixseven")
                .expected(14067)
                .build();

        assertThat(solution.solution(testCase.getNumbers()))
                .isEqualTo(testCase.getExpected());
    }
}
