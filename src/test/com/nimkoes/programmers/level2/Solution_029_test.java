package com.nimkoes.programmers.level2;

import com.nimkoes.programmers.level2.Solution_029;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("프렌즈4블록")
class Solution_029_test {

    @Builder
    @Getter
    static class TestCase {
        int m;
        int n;
        String[] board;

        int expected;
    }

    Solution_029 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_029();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .m(4)
                .n(5)
                .board(new String[]{"CCBDE", "AAADE", "AAABF", "CCBBF"})
                .expected(14)
                .build();

        assertThat(solution.solution(testCase.getM(), testCase.getN(), testCase.getBoard()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .m(6)
                .n(6)
                .board(new String[]{"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"})
                .expected(15)
                .build();

        assertThat(solution.solution(testCase.getM(), testCase.getN(), testCase.getBoard()))
                .isEqualTo(testCase.getExpected());
    }
}
