package com.nimkoes.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("옹알이(1)")
class Solution_001_test {

    @Builder
    @Getter
    static class TestCase {
        String[] babbling;
        int expected;
    }

    Solution_001 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_001();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .babbling(new String[]{"aya", "yee", "u", "maa", "wyeoo"})
                .expected(1)
                .build();

        assertThat(solution.solution(testCase.getBabbling()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .babbling(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"})
                .expected(3)
                .build();

        assertThat(solution.solution(testCase.getBabbling()))
                .isEqualTo(testCase.getExpected());
    }
}
