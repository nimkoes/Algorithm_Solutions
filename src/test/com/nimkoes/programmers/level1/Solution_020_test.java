package com.nimkoes.programmers.level1;

import com.nimkoes.programmers.level1.Solution_020;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("서울에서 김서방 찾기")
class Solution_020_test {

    @Builder
    @Getter
    static class TestCase {
        String[] seoul;

        String expected;
    }

    Solution_020 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_020();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .seoul(new String[]{"Jane", "Kim"})
                .expected("김서방은 1에 있다")
                .build();

        assertThat(solution.solution(testCase.getSeoul()))
                .isEqualTo(testCase.getExpected());
    }
}
