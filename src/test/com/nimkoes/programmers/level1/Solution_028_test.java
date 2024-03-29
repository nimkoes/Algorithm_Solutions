package com.nimkoes.programmers.level1;

import com.nimkoes.programmers.level1.Solution_028;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("핸드폰 번호 가리기")
class Solution_028_test {

    @Builder
    @Getter
    static class TestCase {
        String phone_number;

        String expected;
    }

    Solution_028 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_028();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .phone_number("01033334444")
                .expected("*******4444")
                .build();

        assertThat(solution.solution(testCase.getPhone_number()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .phone_number("027778888")
                .expected("*****8888")
                .build();

        assertThat(solution.solution(testCase.getPhone_number()))
                .isEqualTo(testCase.getExpected());
    }
}
