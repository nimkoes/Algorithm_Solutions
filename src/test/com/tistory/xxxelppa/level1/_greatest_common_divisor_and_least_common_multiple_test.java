package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("최대공약수와 최소공배수")
class _greatest_common_divisor_and_least_common_multiple_test {
    
    @Builder
    @Getter
    static class TestCase {
        int n;
        int m;
        
        int[] expected;
    }
    
    _greatest_common_divisor_and_least_common_multiple solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _greatest_common_divisor_and_least_common_multiple();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .n(3)
                        .m(12)
                        .expected(new int[]{3, 12})
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .n(2)
                        .m(5)
                        .expected(new int[]{1, 10})
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void solution() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getN(), aCase.getM()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}
