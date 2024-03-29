package com.nimkoes.programmers.level1;

import com.nimkoes.programmers.level1.Solution_047;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("비밀지도")
class Solution_047_test {

    @Builder
    @Getter
    static class TestCase {
        int n;
        int[] arr1;
        int[] arr2;

        String[] expected;
    }

    Solution_047 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_047();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(5)
                .arr1(new int[]{9, 20, 28, 18, 11})
                .arr2(new int[]{30, 1, 21, 17, 28})
                .expected(new String[]{"#####", "# # #", "### #", "#  ##", "#####"})
                .build();

        assertThat(solution.solution(testCase.getN(), testCase.getArr1(), testCase.getArr2()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(6)
                .arr1(new int[]{46, 33, 33, 22, 31, 50})
                .arr2(new int[]{27, 56, 19, 14, 14, 10})
                .expected(new String[]{"######", "###  #", "##  ##", " #### ", " #####", "### # "})
                .build();

        assertThat(solution.solution(testCase.getN(), testCase.getArr1(), testCase.getArr2()))
                .isEqualTo(testCase.getExpected());
    }
}
