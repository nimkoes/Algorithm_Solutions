package com.nimkoes.programmers.level0;

import com.nimkoes.programmers.level0.Solution_008;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("나이 출력")
class Solution_008_test {

    @Builder
    @Getter
    static class TestCase {
        int age;
        int expected;
    }

    Solution_008 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_008();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .age(40)
                .expected(1983)
                .build();

        assertThat(solution.solution(testCase.getAge()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .age(23)
                .expected(2000)
                .build();

        assertThat(solution.solution(testCase.getAge()))
                .isEqualTo(testCase.getExpected());
    }
}
