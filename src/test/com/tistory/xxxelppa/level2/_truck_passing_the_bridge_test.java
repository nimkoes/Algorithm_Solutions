package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("다리를 지나는 트럭")
class _truck_passing_the_bridge_test {

    @Builder
    @Getter
    static class TestCase {
        int bridge_length;
        int weight;
        int[] truck_weights;

        int expected;
    }

    _truck_passing_the_bridge solution;

    @BeforeEach
    void setUp() {
        solution = new _truck_passing_the_bridge();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .bridge_length(2)
                .weight(10)
                .truck_weights(new int[]{7, 4, 5, 6})
                .expected(8)
                .build();

        assertThat(solution.solution(testCase.getBridge_length(), testCase.getWeight(), testCase.getTruck_weights()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .bridge_length(100)
                .weight(100)
                .truck_weights(new int[]{10})
                .expected(101)
                .build();

        assertThat(solution.solution(testCase.getBridge_length(), testCase.getWeight(), testCase.getTruck_weights()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .bridge_length(100)
                .weight(100)
                .truck_weights(new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10})
                .expected(110)
                .build();

        assertThat(solution.solution(testCase.getBridge_length(), testCase.getWeight(), testCase.getTruck_weights()))
                .isEqualTo(testCase.getExpected());
    }
}
