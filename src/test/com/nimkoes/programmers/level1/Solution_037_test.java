package com.nimkoes.programmers.level1;

import com.nimkoes.programmers.level1.Solution_037;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("약수의 개수와 덧셈")
class Solution_037_test {

    @Builder
    @Getter
    static class TestCase {
        int left;
        int right;

        int expected;
    }
    
    Solution_037 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_037();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .left(13)
                .right(17)
                .expected(43)
                .build();

        assertThat(solution.solution(testCase.getLeft(), testCase.getRight()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .left(24)
                .right(27)
                .expected(52)
                .build();

        assertThat(solution.solution(testCase.getLeft(), testCase.getRight()))
                .isEqualTo(testCase.getExpected());
    }

}
