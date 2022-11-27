package com.nimkoes.programmers.level0;

import com.nimkoes.programmers.level0.Solution_073;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("잘라서 배열로 저장하기")
class Solution_073_test {

    @Builder
    @Getter
    static class TestCase {
        String my_str;
        int n;
        String[] expected;
    }

    Solution_073 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_073();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .my_str("abc1Addfggg4556b")
                .n(6)
                .expected(new String[]{"abc1Ad", "dfggg4", "556b"})
                .build();

        assertThat(solution.solution(testCase.getMy_str(), testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .my_str("abcdef123")
                .n(3)
                .expected(new String[]{"abc", "def", "123"})
                .build();

        assertThat(solution.solution(testCase.getMy_str(), testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }
}
