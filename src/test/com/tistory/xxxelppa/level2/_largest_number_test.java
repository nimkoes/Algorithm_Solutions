package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("가장 큰 수")
class _largest_number_test {
    
    @Builder
    @Getter
    static class TestCase {
        int[] numbers;
        
        String expected;
    }
    
    _largest_number solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _largest_number();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .numbers(new int[]{6, 10, 2})
                        .expected("6210")
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .numbers(new int[]{3, 30, 34, 5, 9})
                        .expected("9534330")
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void name() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution((aCase.getNumbers())))
                    .isEqualTo(aCase.getExpected());
        }
    }
}