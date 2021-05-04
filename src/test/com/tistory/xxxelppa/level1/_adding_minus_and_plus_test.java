package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("음양 더하기")
class _adding_minus_and_plus_test {
    
    @Builder
    @Getter
    static class TestCase {
        int[] absolutes;
        boolean[] signs;
        
        int expected;
    }
    
    _adding_minus_and_plus solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _adding_minus_and_plus();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .absolutes(new int[]{4, 7, 12})
                        .signs(new boolean[]{true, false, true})
                        .expected(9)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .absolutes(new int[]{1, 2, 3})
                        .signs(new boolean[]{false, false, true})
                        .expected(0)
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void solution() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getAbsolutes(), aCase.getSigns()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}
