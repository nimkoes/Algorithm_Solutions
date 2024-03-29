package com.nimkoes.programmers.level2;

import com.nimkoes.programmers.level2.Solution_053;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("괄호 회전하기")
class Solution_053_test {

    @Builder
    @Getter
    static class TestCase {
        String s;

        int expected;
    }

    Solution_053 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_053();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .s("[](){}")
                .expected(3)
                .build();

        assertThat(solution.solution(testCase.getS()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .s("}]()[{")
                .expected(2)
                .build();

        assertThat(solution.solution(testCase.getS()))
                .isEqualTo(testCase.getExpected());
    }
    
    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .s("[)(]")
                .expected(0)
                .build();
        
        assertThat(solution.solution(testCase.getS()))
                .isEqualTo(testCase.getExpected());
    }
    
    @Test
    @DisplayName("입출력 예 테스트 4")
    void test_04() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .s("}}}")
                .expected(0)
                .build();
        
        assertThat(solution.solution(testCase.getS()))
                .isEqualTo(testCase.getExpected());
    }
    
}
