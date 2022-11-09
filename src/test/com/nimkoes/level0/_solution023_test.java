package com.nimkoes.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("배열 원소의 길이")
class _solution023_test {

    @Builder
    @Getter
    static class TestCase {
        String[] strlist;
        int[] expected;
    }

    Solution_023 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_023();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .strlist(new String[]{"We", "are", "the", "world!"})
                .expected(new int[]{2, 3, 3, 6})
                .build();

        assertThat(solution.solution(testCase.getStrlist()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .strlist(new String[]{"I", "Love", "Programmers."})
                .expected(new int[]{1, 4, 12})
                .build();

        assertThat(solution.solution(testCase.getStrlist()))
                .isEqualTo(testCase.getExpected());
    }
}
