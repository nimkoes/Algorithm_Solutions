package com.nimkoes.programmers.level0;

import com.nimkoes.programmers.level0.Solution_089;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("치킨 쿠폰")
class Solution_089_test {

    @Builder
    @Getter
    static class TestCase {
        int chicken;
        int expected;
    }

    Solution_089 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_089();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .chicken(100)
                .expected(11)
                .build();

        assertThat(solution.solution(testCase.getChicken()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .chicken(1081)
                .expected(120)
                .build();

        assertThat(solution.solution(testCase.getChicken()))
                .isEqualTo(testCase.getExpected());
    }
}
