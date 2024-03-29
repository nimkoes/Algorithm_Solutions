package com.nimkoes.programmers.level2;

import com.nimkoes.programmers.level2.Solution_047;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("최솟값 만들기")
class Solution_047_test {

    @Builder
    @Getter
    static class TestCase {
        int[] A;
        int[] B;

        int expected;
    }

    Solution_047 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_047();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .A(new int[]{1, 4, 2})
                .B(new int[]{5, 4, 4})
                .expected(29)
                .build();

        assertThat(solution.solution(testCase.getA(), testCase.getB()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .A(new int[]{1, 2})
                .B(new int[]{3, 4})
                .expected(10)
                .build();

        assertThat(solution.solution(testCase.getA(), testCase.getB()))
                .isEqualTo(testCase.getExpected());
    }
}
