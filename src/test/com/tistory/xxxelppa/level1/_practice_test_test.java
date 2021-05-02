package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("모의고사")
class _practice_test_test {
    
    @Builder
    @Getter
    static class TestCase {
        int[] answers;
        
        int[] expected;
    }
    
    _practice_test solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _practice_test();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .answers(new int[]{1, 2, 3, 4, 5})
                        .expected(new int[]{1})
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .answers(new int[]{1, 3, 2, 4, 2})
                        .expected(new int[]{1, 2, 3})
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void solution() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getAnswers())).isEqualTo(aCase.getExpected());
        }
    }
}
