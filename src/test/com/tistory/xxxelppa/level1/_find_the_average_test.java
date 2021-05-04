package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("평균 구하기")
class _find_the_average_test {
    
    @Builder
    @Getter
    static class TestCase {
        int[] arr;
        
        double expected;
    }
    
    _find_the_average solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _find_the_average();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .arr(new int[]{1, 2, 3, 4})
                        .expected(2.5)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .arr(new int[]{5, 5})
                        .expected(5)
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void solution() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getArr()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}
