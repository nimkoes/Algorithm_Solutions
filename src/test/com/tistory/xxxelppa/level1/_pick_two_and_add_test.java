package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("두 개 뽑아서 더하기")
class _pick_two_and_add_test {
    
    @Builder
    @Getter
    static class TestCase {
        int[] numbers;
        
        int[] expected;
    }
    
    _pick_two_and_add solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _pick_two_and_add();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .numbers(new int[]{2, 1, 3, 4, 1})
                        .expected(new int[]{2, 3, 4, 5, 6, 7})
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .numbers(new int[]{5, 0, 2, 7})
                        .expected(new int[]{2, 5, 7, 9, 12})
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void solution() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getNumbers()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}
