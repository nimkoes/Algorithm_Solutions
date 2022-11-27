package com.nimkoes.programmers.level2;

import com.nimkoes.programmers.level2.Solution_050;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("JadenCase 문자열 만들기")
class Solution_050_test {

    @Builder
    @Getter
    static class TestCase {
        String s;

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
                .s("3people unFollowed me")
                .expected("3people Unfollowed Me")
                .build();

        assertThat(solution.solution(testCase.getS()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .s("for the last week")
                .expected("For The Last Week")
                .build();

        assertThat(solution.solution(testCase.getS()))
                .isEqualTo(testCase.getExpected());
    }
}
