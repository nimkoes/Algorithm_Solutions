package com.nimkoes.programmers.level2;

import com.nimkoes.programmers.level2.Solution_023;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("위장")
class Solution_023_test {

    @Builder
    @Getter
    static class TestCase {
        String[][] clothes;

        int expected;
    }

    Solution_023 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_023();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .clothes(new String[][]{{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}})
                .expected(5)
                .build();

        assertThat(solution.solution(testCase.getClothes()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .clothes(new String[][]{{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}})
                .expected(3)
                .build();

        assertThat(solution.solution(testCase.getClothes()))
                .isEqualTo(testCase.getExpected());
    }
}
