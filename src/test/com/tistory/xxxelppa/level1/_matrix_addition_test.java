package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("행렬의 덧셈")
class _matrix_addition_test {
    
    @Builder
    @Getter
    static class TestCase {
        int[][] arr1;
        int[][] arr2;
        
        int[][] expected;
    }
    
    _matrix_addition solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _matrix_addition();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .arr1(new int[][]{{1, 2}, {2, 3}})
                        .arr2(new int[][]{{3, 4}, {5, 6}})
                        .expected(new int[][]{{4, 6}, {7, 9}})
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .arr1(new int[][]{{1}, {2}})
                        .arr2(new int[][]{{3}, {4}})
                        .expected(new int[][]{{4}, {6}})
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void solution() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getArr1(), aCase.getArr2()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}
