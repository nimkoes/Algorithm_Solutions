package com.nimkoes.programmers.level0;

import com.nimkoes.programmers.level0.Solution_027;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("배열 자르기")
class Solution_027_test {

    @Builder
    @Getter
    static class TestCase {
        int[] dot;
        int expected;
    }

    Solution_027 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_027();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .dot(new int[]{2, 4})
                .expected(1)
                .build();

        assertThat(solution.solution(testCase.getDot()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .dot(new int[]{-7, 9})
                .expected(2)
                .build();

        assertThat(solution.solution(testCase.getDot()))
                .isEqualTo(testCase.getExpected());
    }
}
