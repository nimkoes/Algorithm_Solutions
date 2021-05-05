package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("다리를 지나는 트럭")
class _truck_passing_the_bridge_test {
    
    @Builder
    @Getter
    static class TestCase {
        int bridge_length;
        int weight;
        int[] truck_weights;
        
        int expected;
    }
    
    _truck_passing_the_bridge solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _truck_passing_the_bridge();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .bridge_length(2)
                        .weight(10)
                        .truck_weights(new int[]{7, 4, 5, 6})
                        .expected(8)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .bridge_length(100)
                        .weight(100)
                        .truck_weights(new int[]{10})
                        .expected(101)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .bridge_length(100)
                        .weight(100)
                        .truck_weights(new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10})
                        .expected(110)
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void name() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getBridge_length(), aCase.getWeight(), aCase.getTruck_weights()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}