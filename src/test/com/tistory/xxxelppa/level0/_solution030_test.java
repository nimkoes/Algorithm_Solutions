package com.tistory.xxxelppa.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("옷가게 할인 받기")
class _solution030_test {

    @Builder
    @Getter
    static class TestCase {
        int price;
        int expected;
    }

    Solution_030 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_030();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .price(150000)
                .expected(142500)
                .build();

        assertThat(solution.solution(testCase.getPrice()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .price(580000)
                .expected(464000)
                .build();

        assertThat(solution.solution(testCase.getPrice()))
                .isEqualTo(testCase.getExpected());
    }
}
