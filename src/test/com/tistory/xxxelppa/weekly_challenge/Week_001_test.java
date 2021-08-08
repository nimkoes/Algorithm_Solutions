package com.tistory.xxxelppa.weekly_challenge;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Week 001")
class Week_001_test {

    @Builder
    @Getter
    static class TestCase {
        int price;
        int money;
        int count;

        int expected;
    }

    Week_001 solution;

    @BeforeEach
    void setUp() {
        solution = new Week_001();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .price(3)
                .money(20)
                .count(4)
                .expected(10)
                .build();

        assertThat(solution.solution(testCase.getPrice(), testCase.getMoney(), testCase.getCount()))
                .isEqualTo(testCase.getExpected());
    }
}
