package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("3진법 뒤집기")
class _reverse_order_the_ternary_system_test {
    
    @Builder
    @Getter
    static class TestCase {
        int n;
        
        int expected;
    }
    
    _reverse_order_the_ternary_system solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _reverse_order_the_ternary_system();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .n(45)
                        .expected(7)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .n(125)
                        .expected(229)
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void solution() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getN()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}
