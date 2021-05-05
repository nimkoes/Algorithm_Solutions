package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("N개의 최소공배수")
class _n_least_common_multiples_test {
    
    @Builder
    @Getter
    static class TestCase {
        int[] arr;
        
        int expected;
    }
    
    _n_least_common_multiples solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _n_least_common_multiples();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .arr(new int[]{2, 6, 8, 14})
                        .expected(168)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .arr(new int[]{1, 2, 3})
                        .expected(6)
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void name() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getArr()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}