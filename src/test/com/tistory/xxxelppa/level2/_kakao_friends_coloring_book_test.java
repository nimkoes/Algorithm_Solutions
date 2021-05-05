package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("카카오프렌즈 컬러링북")
class _kakao_friends_coloring_book_test {
    
    @Builder
    @Getter
    static class TestCase {
        int m;
        int n;
        int[][] picture;
        
        int[] expected;
    }
    
    _kakao_friends_coloring_book solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _kakao_friends_coloring_book();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .m(6)
                        .n(4)
                        .picture(new int[][]{{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}})
                        .expected(new int[]{4, 5})
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void solution() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getM(), aCase.getN(), aCase.getPicture()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}