package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("핸드폰 번호 가리기")
class _hide_your_cell_phone_number_test {
    
    @Builder
    @Getter
    static class TestCase {
        String phone_number;
        
        String expected;
    }
    
    _hide_your_cell_phone_number solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _hide_your_cell_phone_number();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .phone_number("01033334444")
                        .expected("*******4444")
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .phone_number("027778888")
                        .expected("*****8888")
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void solution() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getPhone_number()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}
