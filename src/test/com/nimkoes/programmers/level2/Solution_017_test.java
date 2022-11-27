package com.nimkoes.programmers.level2;

import com.nimkoes.programmers.level2.Solution_017;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("뉴스 클러스터링")
class Solution_017_test {

    @Builder
    @Getter
    static class TestCase {
        String str1;
        String str2;

        int expected;
    }

    Solution_017 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_017();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .str1("FRANCE")
                .str2("french")
                .expected(16384)
                .build();

        assertThat(solution.solution(testCase.getStr1(), testCase.getStr2()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .str1("handshake")
                .str2("shake hands")
                .expected(65536)
                .build();

        assertThat(solution.solution(testCase.getStr1(), testCase.getStr2()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .str1("aa1+aa2")
                .str2("AAAA12")
                .expected(43690)
                .build();

        assertThat(solution.solution(testCase.getStr1(), testCase.getStr2()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 4")
    void test_04() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .str1("E=M*C^2")
                .str2("e=m*c^2")
                .expected(65536)
                .build();

        assertThat(solution.solution(testCase.getStr1(), testCase.getStr2()))
                .isEqualTo(testCase.getExpected());
    }
}
