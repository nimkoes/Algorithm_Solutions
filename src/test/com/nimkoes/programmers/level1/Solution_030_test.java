package com.nimkoes.programmers.level1;

import com.nimkoes.programmers.level1.Solution_030;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("정수 제곱근 판별")
class Solution_030_test {

    @Builder
    @Getter
    static class TestCase {
        long n;

        long expected;
    }

    Solution_030 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_030();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(121)
                .expected(144)
                .build();

        assertThat(solution.solution(testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(3)
                .expected(-1)
                .build();

        assertThat(solution.solution(testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }
}
