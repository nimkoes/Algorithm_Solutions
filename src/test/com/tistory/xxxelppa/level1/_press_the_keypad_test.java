package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("키패드 누르기")
class _press_the_keypad_test {
    
    @Builder
    @Getter
    static class TestCase {
        int[] numbers;
        String hand;
        
        String expected;
    }
    
    _press_the_keypad solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _press_the_keypad();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .numbers(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5})
                        .hand("right")
                        .expected("LRLLLRLLRRL")
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .numbers(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2})
                        .hand("left")
                        .expected("LRLLRRLLLRR")
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .numbers(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0})
                        .hand("right")
                        .expected("LLRLLRLLRL")
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void solution() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getNumbers(), aCase.getHand()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}
