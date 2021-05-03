package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("같은 숫자는 싫어")
class _i_hate_the_same_number_test {
    
    @Builder
    @Getter
    static class TestCase {
        int[] arr;
        
        int[] expected;
    }
    
    _i_hate_the_same_number solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _i_hate_the_same_number();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .arr(new int[]{1, 1, 3, 3, 0, 1, 1})
                        .expected(new int[]{1, 3, 0, 1})
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .arr(new int[]{4, 4, 4, 3, 3})
                        .expected(new int[]{4, 3})
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
