package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("두 정수 사이의 합")
class _the_sum_between_two_integers_test {
    
    @Builder
    @Getter
    static class TestCase {
        int a;
        int b;
        
        long expected;
    }
    
    _the_sum_between_two_integers solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _the_sum_between_two_integers();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .a(3)
                        .b(5)
                        .expected(12)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .a(3)
                        .b(3)
                        .expected(3)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .a(5)
                        .b(3)
                        .expected(12)
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void solution() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getA(), aCase.getB()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}
