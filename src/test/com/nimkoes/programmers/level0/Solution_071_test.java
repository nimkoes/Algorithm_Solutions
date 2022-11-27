package com.nimkoes.programmers.level0;

import com.nimkoes.programmers.level0.Solution_071;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("진료 순서 정하기")
class Solution_071_test {

    @Builder
    @Getter
    static class TestCase {
        int[] emergency;
        int[] expected;
    }

    Solution_071 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_071();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .emergency(new int[]{3, 76, 24})
                .expected(new int[]{3, 1, 2})
                .build();

        assertThat(solution.solution(testCase.getEmergency()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .emergency(new int[]{1, 2, 3, 4, 5, 6, 7})
                .expected(new int[]{7, 6, 5, 4, 3, 2, 1})
                .build();

        assertThat(solution.solution(testCase.getEmergency()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .emergency(new int[]{30, 10, 23, 6, 100})
                .expected(new int[]{2, 4, 3, 5, 1})
                .build();

        assertThat(solution.solution(testCase.getEmergency()))
                .isEqualTo(testCase.getExpected());
    }
}
