package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("비밀지도")
class _secret_map_test {
    
    @Builder
    @Getter
    static class TestCase {
        int n;
        int[] arr1;
        int[] arr2;
        
        String[] expected;
    }
    
    _secret_map solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _secret_map();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .n(5)
                        .arr1(new int[]{9, 20, 28, 18, 11})
                        .arr2(new int[]{30, 1, 21, 17, 28})
                        .expected(new String[]{"#####", "# # #", "### #", "#  ##", "#####"})
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .n(6)
                        .arr1(new int[]{46, 33, 33, 22, 31, 50})
                        .arr2(new int[]{27, 56, 19, 14, 14, 10})
                        .expected(new String[]{"######", "###  #", "##  ##", " #### ", " #####", "### # "})
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void solution() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getN(), aCase.getArr1(), aCase.getArr2()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}
