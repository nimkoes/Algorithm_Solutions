package com.nimkoes.programmers.level0;

import com.nimkoes.programmers.level0.Solution_017;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("아이스 아메리카노")
class Solution_017_test {

    @Builder
    @Getter
    static class TestCase {
        int money;
        int[] expected;
    }

    Solution_017 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_017();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .money(5500)
                .expected(new int[]{1, 0})
                .build();

        assertThat(solution.solution(testCase.getMoney()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .money(15000)
                .expected(new int[]{2, 4000})
                .build();

        assertThat(solution.solution(testCase.getMoney()))
                .isEqualTo(testCase.getExpected());
    }
}
