package com.nimkoes.programmers.level0;

import com.nimkoes.programmers.level0.Solution_080;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("외계어 사전")
class Solution_080_test {

    @Builder
    @Getter
    static class TestCase {
        String[] spell;
        String[] dic;
        int expected;
    }

    Solution_080 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_080();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .spell(new String[]{"p", "o", "s"})
                .dic(new String[]{"sod", "eocd", "qixm", "adio", "soo"})
                .expected(2)
                .build();

        assertThat(solution.solution(testCase.getSpell(), testCase.getDic()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .spell(new String[]{"z", "d", "x"})
                .dic(new String[]{"def", "dww", "dzx", "loveaw"})
                .expected(1)
                .build();

        assertThat(solution.solution(testCase.getSpell(), testCase.getDic()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .spell(new String[]{"s", "o", "m", "d"})
                .dic(new String[]{"moos", "dzx", "smm", "sunmmo", "som"})
                .expected(2)
                .build();

        assertThat(solution.solution(testCase.getSpell(), testCase.getDic()))
                .isEqualTo(testCase.getExpected());
    }
}
