package com.nimkoes.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("로또의 최고 순위와 최저 순위")
class _lotto_highest_and_lowest_rankings_test {

    @Builder
    @Getter
    static class TestCase {
        int[] lottos;
        int[] win_nums;

        int[] expected;
    }

    _lotto_highest_and_lowest_rankings solution;

    @BeforeEach
    void setUp() {
        solution = new _lotto_highest_and_lowest_rankings();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .lottos(new int[]{44, 1, 0, 0, 31, 25})
                .win_nums(new int[]{31, 10, 45, 1, 6, 19})
                .expected(new int[]{3, 5})
                .build();

        assertThat(solution.solution(testCase.getLottos(), testCase.getWin_nums()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .lottos(new int[]{0, 0, 0, 0, 0, 0})
                .win_nums(new int[]{38, 19, 20, 40, 15, 25})
                .expected(new int[]{1, 6})
                .build();

        assertThat(solution.solution(testCase.getLottos(), testCase.getWin_nums()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .lottos(new int[]{45, 4, 35, 20, 3, 9})
                .win_nums(new int[]{20, 9, 3, 45, 4, 35})
                .expected(new int[]{1, 1})
                .build();

        assertThat(solution.solution(testCase.getLottos(), testCase.getWin_nums()))
                .isEqualTo(testCase.getExpected());
    }
}
