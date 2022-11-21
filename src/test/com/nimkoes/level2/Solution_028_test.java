package com.nimkoes.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("구명보트")
class Solution_028_test {

    @Builder
    @Getter
    static class TestCase {
        int[] people;
        int limit;

        int expected;
    }

    Solution_028 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_028();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .people(new int[]{70, 50, 80, 50})
                .limit(100)
                .expected(3)
                .build();

        assertThat(solution.solution(testCase.getPeople(), testCase.getLimit()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .people(new int[]{70, 80, 50})
                .limit(100)
                .expected(3)
                .build();

        assertThat(solution.solution(testCase.getPeople(), testCase.getLimit()))
                .isEqualTo(testCase.getExpected());
    }
}
