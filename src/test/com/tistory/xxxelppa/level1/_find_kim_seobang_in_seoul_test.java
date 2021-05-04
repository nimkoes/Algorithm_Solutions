package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("서울에서 김서방 찾기")
class _find_kim_seobang_in_seoul_test {
    
    @Builder
    @Getter
    static class TestCase {
        String[] seoul;
        
        String expected;
    }
    
    _find_kim_seobang_in_seoul solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _find_kim_seobang_in_seoul();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .seoul(new String[]{"Jane", "Kim"})
                        .expected("김서방은 1에 있다")
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void solution() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getSeoul()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}
