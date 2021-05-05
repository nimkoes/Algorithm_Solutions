package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("튜플")
class _tuple_test {
    
    @Builder
    @Getter
    static class TestCase {
        String s;
        
        int[] expected;
    }
    
    _tuple solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _tuple();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .s("{{2},{2,1},{2,1,3},{2,1,3,4}}")
                        .expected(new int[]{2, 1, 3, 4})
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .s("{{1,2,3},{2,1},{1,2,4,3},{2}}")
                        .expected(new int[]{2, 1, 3, 4})
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .s("{{20,111},{111}}")
                        .expected(new int[]{111, 20})
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .s("{{123}}")
                        .expected(new int[]{123})
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .s("{{4,2,3},{3},{2,3,4,1},{2,3}}")
                        .expected(new int[]{3, 2, 4, 1})
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void name() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getS()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}