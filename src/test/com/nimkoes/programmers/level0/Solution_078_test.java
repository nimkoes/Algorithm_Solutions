package com.nimkoes.programmers.level0;

import com.nimkoes.programmers.level0.Solution_078;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("구슬을 나누는 경우의 수")
class Solution_078_test {

    @Builder
    @Getter
    static class TestCase {
        int balls;
        int share;
        int expected;
    }

    Solution_078 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_078();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .balls(3)
                .share(2)
                .expected(3)
                .build();

        assertThat(solution.solution(testCase.getBalls(), testCase.getShare()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .balls(5)
                .share(3)
                .expected(10)
                .build();

        assertThat(solution.solution(testCase.getBalls(), testCase.getShare()))
                .isEqualTo(testCase.getExpected());
    }
}
