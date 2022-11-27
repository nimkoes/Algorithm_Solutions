package com.nimkoes.programmers.level0;

import com.nimkoes.programmers.level0.Solution_015;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("짝수 홀수 개수")
class Solution_015_test {

    @Builder
    @Getter
    static class TestCase {
        int[] num_list;
        int[] expected;
    }

    Solution_015 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_015();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .num_list(new int[]{1, 2, 3, 4, 5})
                .expected(new int[]{2, 3})
                .build();

        assertThat(solution.solution(testCase.getNum_list()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .num_list(new int[]{1, 3, 5, 7})
                .expected(new int[]{0, 4})
                .build();

        assertThat(solution.solution(testCase.getNum_list()))
                .isEqualTo(testCase.getExpected());
    }
}
