package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("땅따먹기")
class _ground_picking_test {
    
    @Builder
    @Getter
    static class TestCase {
        int[][] land;
        
        int expected;
    }
    
    _ground_picking solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _ground_picking();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .land(new int[][]{{1, 2, 3, 5}, {5, 6, 7, 8,}, {4, 3, 2, 1}})
                        .expected(16)
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void name() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getLand()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}