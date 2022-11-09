package com.tistory.xxxelppa.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("배열 두배 만들기")
class _solution022_test {

    @Builder
    @Getter
    static class TestCase {
        int[] numbers;
        int[] expected;
    }

    Solution_022 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_022();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .numbers(new int[]{1, 2, 3, 4, 5})
                .expected(new int[]{2, 4, 6, 8, 10})
                .build();

        assertThat(solution.solution(testCase.getNumbers()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .numbers(new int[]{1, 2, 100, -99, 1, 2, 3})
                .expected(new int[]{2, 4, 200, -198, 2, 4, 6})
                .build();

        assertThat(solution.solution(testCase.getNumbers()))
                .isEqualTo(testCase.getExpected());
    }
}
