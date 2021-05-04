package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("소수 만들기")
class _making_prime_numbers_test {
    
    @Builder
    @Getter
    static class TestCase {
        int[] nums;
        
        int expected;
    }
    
    _making_prime_numbers solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _making_prime_numbers();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .nums(new int[]{1, 2, 3, 4})
                        .expected(1)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .nums(new int[]{1, 2, 7, 6, 4})
                        .expected(4)
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
