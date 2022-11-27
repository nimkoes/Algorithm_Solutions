package com.nimkoes.programmers.level0;

import com.nimkoes.programmers.level0.Solution_058;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("암호 해독")
class Solution_058_test {

    @Builder
    @Getter
    static class TestCase {
        String cipher;
        int code;
        String expected;
    }

    Solution_058 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_058();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .cipher("dfjardstddetckdaccccdegk")
                .code(4)
                .expected("attack")
                .build();

        assertThat(solution.solution(testCase.getCipher(), testCase.getCode()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .cipher("pfqallllabwaoclk")
                .code(2)
                .expected("fallback")
                .build();

        assertThat(solution.solution(testCase.getCipher(), testCase.getCode()))
                .isEqualTo(testCase.getExpected());
    }
}
