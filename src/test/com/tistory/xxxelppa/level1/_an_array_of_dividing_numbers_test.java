package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("나누어 떨어지는 숫자 배열")
class _an_array_of_dividing_numbers_test {
    
    @Builder
    @Getter
    static class TestCase {
        int[] arr;
        int divisor;
        
        int[] expected;
    }
    
    _an_array_of_dividing_numbers solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _an_array_of_dividing_numbers();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .arr(new int[]{5, 9, 7, 10})
                        .divisor(5)
                        .expected(new int[]{5, 10})
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .arr(new int[]{2, 36, 1, 3})
                        .divisor(1)
                        .expected(new int[]{1, 2, 3, 36})
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .arr(new int[]{3, 2, 6})
                        .divisor(10)
                        .expected(new int[]{-1})
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void solution() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getArr(), aCase.getDivisor()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}
