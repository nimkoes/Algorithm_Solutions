package com.nimkoes.programmers.level1;

import com.nimkoes.programmers.level1.Solution_003;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("없는 숫자 더하기")
class Solution_003_test {

    @Builder
    @Getter
    static class TestCase {
        int[] numbers;

        int expected;
    }

    Solution_003 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_003();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .numbers(new int[]{1, 2, 3, 4, 6, 7, 8, 0})
                .expected(14)
                .build();

        assertThat(solution.solution(testCase.getNumbers()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .numbers(new int[]{5, 8, 4, 0, 6, 7, 9})
                .expected(6)
                .build();

        assertThat(solution.solution(testCase.getNumbers()))
                .isEqualTo(testCase.getExpected());
    }
}
