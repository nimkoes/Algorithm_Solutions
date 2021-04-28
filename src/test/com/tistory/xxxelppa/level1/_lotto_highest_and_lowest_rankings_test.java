package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("로또의 최고 순위와 최저 순위")
class _lotto_highest_and_lowest_rankings_test {
    
    @Builder
    @Getter
    static class TestCase {
        int[] lottos;
        int[] win_nums;
        
        int[] expected;
    }
    
    _lotto_highest_and_lowest_rankings solution;
    ArrayList<TestCase> testCase;
    
    
    @BeforeEach
    void setUp() {
        solution = new _lotto_highest_and_lowest_rankings();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .lottos(new int[]{44, 1, 0, 0, 31, 25})
                        .win_nums(new int[]{31, 10, 45, 1, 6, 19})
                        .expected(new int[]{3, 5})
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .lottos(new int[]{0, 0, 0, 0, 0, 0})
                        .win_nums(new int[]{38, 19, 20, 40, 15, 25})
                        .expected(new int[]{1, 6})
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .lottos(new int[]{45, 4, 35, 20, 3, 9})
                        .win_nums(new int[]{20, 9, 3, 45, 4, 35})
                        .expected(new int[]{1, 1})
                        .build()
        );
        
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void solution() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getLottos(), aCase.getWin_nums()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}
