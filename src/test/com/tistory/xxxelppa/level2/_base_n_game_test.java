package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("N진수 게임")
class _base_n_game_test {

    @Builder
    @Getter
    static class TestCase {
        int n;
        int t;
        int m;
        int p;

        String expected;
    }

    _base_n_game solution;

    @BeforeEach
    void setUp() {
        solution = new _base_n_game();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(2)
                .t(4)
                .m(2)
                .p(1)
                .expected("0111")
                .build();

        assertThat(solution.solution(testCase.getN(), testCase.getT(), testCase.getM(), testCase.getP()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(16)
                .t(16)
                .m(2)
                .p(1)
                .expected("02468ACE11111111")
                .build();

        assertThat(solution.solution(testCase.getN(), testCase.getT(), testCase.getM(), testCase.getP()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(16)
                .t(16)
                .m(2)
                .p(2)
                .expected("13579BDF01234567")
                .build();

        assertThat(solution.solution(testCase.getN(), testCase.getT(), testCase.getM(), testCase.getP()))
                .isEqualTo(testCase.getExpected());
    }
}
