package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("체육복")
class _gym_clothes_test {

    @Builder
    @Getter
    static class TestCase {
        int n;
        int[] lost;
        int[] reserve;

        int expected;
    }

    _gym_clothes solution;
    ArrayList<TestCase> testCases;

    @BeforeEach
    void setUp() {
        solution = new _gym_clothes();
        testCases = new ArrayList<>();

        testCases.add(
                new TestCase.TestCaseBuilder()
                        .n(5)
                        .lost(new int[]{2, 4})
                        .reserve(new int[]{1, 3, 5})
                        .expected(5)
                        .build()
        );

        testCases.add(
                new TestCase.TestCaseBuilder()
                        .n(5)
                        .lost(new int[]{2, 4})
                        .reserve(new int[]{3})
                        .expected(4)
                        .build()
        );

        testCases.add(
                new TestCase.TestCaseBuilder()
                        .n(3)
                        .lost(new int[]{3})
                        .reserve(new int[]{1})
                        .expected(2)
                        .build()
        );

    }

    @Test
    @DisplayName("입출력 예 테스트")
    void solution() {
        for (TestCase aCase : testCases) {
            assertThat(solution.solution(aCase.getN(), aCase.getLost(), aCase.getReserve())).isEqualTo(aCase.getExpected());
        }
    }

}