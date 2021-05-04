package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("내적")
class _dot_product_test {
    
    @Builder
    @Getter
    static class TestCase {
        int[] a;
        int[] b;
        
        int expected;
    }
    
    _dot_product solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _dot_product();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .a(new int[]{1, 2, 3, 4})
                        .b(new int[]{-3, -1, 0, 2})
                        .expected(3)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .a(new int[]{-1, 0, 1})
                        .b(new int[]{1, 0, -1})
                        .expected(-2)
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
