package com.nimkoes.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("")
class Solution_057_test_ {

    @Builder
    @Getter
    static class TestCase {
        int expected;
    }

    Solution_057_ solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_057_();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .expected(0)
                .build();

        assertThat(solution.solution())
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .expected(0)
                .build();

        assertThat(solution.solution())
                .isEqualTo(testCase.getExpected());
    }
}
