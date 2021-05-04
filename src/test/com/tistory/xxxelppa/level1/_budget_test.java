package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("예산")
class _budget_test {
    
    @Builder
    @Getter
    static class TestCase {
        int[] d;
        int budget;
        
        int expected;
    }
    
    _budget solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _budget();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .d(new int[]{1, 3, 2, 5, 4})
                        .budget(9)
                        .expected(3)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .d(new int[]{2, 2, 3, 3})
                        .budget(10)
                        .expected(4)
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void solution() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getD(), aCase.getBudget()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}
