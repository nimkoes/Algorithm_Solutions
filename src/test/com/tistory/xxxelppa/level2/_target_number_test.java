package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("타겟 넘버")
class _target_number_test {
    
    @Builder
    @Getter
    static class TestCase {
        int[] numbers;
        int target;
        
        int expected;
    }
    
    _target_number solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _target_number();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .numbers(new int[]{1, 1, 1, 1, 1})
                        .target(3)
                        .expected(5)
                        .build()
        );
        
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void solution() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getNumbers(), aCase.getTarget()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}