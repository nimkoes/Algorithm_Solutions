package com.nimkoes.programmers.level1;

import com.nimkoes.programmers.level1.Solution_012;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("문자열을 정수로 바꾸기")
class Solution_012_test {

    @Builder
    @Getter
    static class TestCase {
        String s;

        int expected;
    }

    Solution_012 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_012();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .s("1234")
                .expected(1234)
                .build();

        assertThat(solution.solution(testCase.getS()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .s("-1234")
                .expected(-1234)
                .build();

        assertThat(solution.solution(testCase.getS()))
                .isEqualTo(testCase.getExpected());
    }
}
