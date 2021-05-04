package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("포켓몬")
class _ponketmon_test {
    
    @Builder
    @Getter
    static class TestCase {
        int[] nums;
        
        int expected;
    }
    
    _ponketmon solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _ponketmon();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .nums(new int[]{3, 1, 2, 3})
                        .expected(2)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .nums(new int[]{3, 3, 3, 2, 2, 4})
                        .expected(3)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .nums(new int[]{3, 3, 3, 2, 2, 2})
                        .expected(2)
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void solution() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getNums()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}
