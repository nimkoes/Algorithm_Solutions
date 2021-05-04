package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("x만큼 간격이 있는 n개의 숫자")
class _n_numbers_spaced_by_x_test {
    
    @Builder
    @Getter
    static class TestCase {
        long x;
        int n;
        
        long[] expected;
    }
    
    _n_numbers_spaced_by_x solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _n_numbers_spaced_by_x();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .x(2)
                        .n(5)
                        .expected(new long[]{2, 4, 6, 8, 10})
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .x(4)
                        .n(3)
                        .expected(new long[]{4, 8, 12})
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .x(-4)
                        .n(2)
                        .expected(new long[]{-4, -8})
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void solution() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getX(), aCase.getN()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}
