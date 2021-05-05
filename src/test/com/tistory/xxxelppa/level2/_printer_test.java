package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("프린터")
class _printer_test {
    
    @Builder
    @Getter
    static class TestCase {
        int[] priorities;
        int location;
        
        int expected;
    }
    
    _printer solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _printer();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .priorities(new int[]{2, 1, 3, 2})
                        .location(2)
                        .expected(1)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .priorities(new int[]{1, 1, 9, 1, 1, 1})
                        .location(0)
                        .expected(5)
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void name() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getPriorities(), aCase.getLocation()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}