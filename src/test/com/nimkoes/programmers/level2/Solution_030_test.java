package com.nimkoes.programmers.level2;

import com.nimkoes.programmers.level2.Solution_030;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("주식가격")
class Solution_030_test {
    
    @Builder
    @Getter
    static class TestCase {
        int[] prices;
        
        int[] expected;
    }
    
    Solution_030 solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new Solution_030();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .prices(new int[]{1, 2, 3, 2, 3})
                        .expected(new int[]{4, 3, 1, 1, 0})
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void name() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getPrices()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}
