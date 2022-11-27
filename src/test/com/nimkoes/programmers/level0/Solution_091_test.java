package com.nimkoes.programmers.level0;

import com.nimkoes.programmers.level0.Solution_091;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("저주의 숫자 3")
class Solution_091_test {

    @Builder
    @Getter
    static class TestCase {
        int n;
        int expected;
    }

    Solution_091 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_091();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(15)
                .expected(25)
                .build();

        assertThat(solution.solution(testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(40)
                .expected(76)
                .build();

        assertThat(solution.solution(testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }
}
