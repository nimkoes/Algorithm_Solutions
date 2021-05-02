package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("K번째수")
class _kth_number_test {
    
    @Builder
    @Getter
    static class TestCase {
        int[] array;
        int[][] commands;
        
        int[] expected;
    }
    
    _kth_number solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _kth_number();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .array(new int[]{1, 5, 2, 6, 3, 7, 4})
                        .commands(new int[][]{
                                {2, 5, 3},
                                {4, 4, 1},
                                {1, 7, 3}
                        })
                        .expected(new int[]{5, 6, 3})
                        .build()
        );
        
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void solution() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getArray(), aCase.getCommands()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}
