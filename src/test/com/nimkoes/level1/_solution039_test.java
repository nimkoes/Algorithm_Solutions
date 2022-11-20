package com.nimkoes.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("두 개 뽑아서 더하기")
class _solution039_test {

    @Builder
    @Getter
    static class TestCase {
        int[] numbers;

        int[] expected;
    }

    Solution_039 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_039();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .numbers(new int[]{2, 1, 3, 4, 1})
                .expected(new int[]{2, 3, 4, 5, 6, 7})
                .build();

        assertThat(solution.solution(testCase.getNumbers()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .numbers(new int[]{5, 0, 2, 7})
                .expected(new int[]{2, 5, 7, 9, 12})
                .build();

        assertThat(solution.solution(testCase.getNumbers()))
                .isEqualTo(testCase.getExpected());
    }
}
