package com.nimkoes.programmers.level0;

import com.nimkoes.programmers.level0.Solution_063;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("A로 B 만들기")
class Solution_063_test {

    @Builder
    @Getter
    static class TestCase {
        String before;
        String after;
        int expected;
    }

    Solution_063 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_063();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .before("olleh")
                .after("hello")
                .expected(1)
                .build();

        assertThat(solution.solution(testCase.getBefore(), testCase.getAfter()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .before("allpe")
                .after("apple")
                .expected(0)
                .build();

        assertThat(solution.solution(testCase.getBefore(), testCase.getAfter()))
                .isEqualTo(testCase.getExpected());
    }
}
