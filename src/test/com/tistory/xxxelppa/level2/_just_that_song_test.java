package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("방금그곡")
class _just_that_song_test {
    
    @Builder
    @Getter
    static class TestCase {
        String m;
        String[] musicinfos;
        
        String expected;
    }
    
    _just_that_song solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _just_that_song();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .m("ABCDEFG")
                        .musicinfos(new String[]{"12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"})
                        .expected("HELLO")
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .m("CC#BCC#BCC#BCC#B")
                        .musicinfos(new String[]{"03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B"})
                        .expected("FOO")
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .m("ABC")
                        .musicinfos(new String[]{"12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"})
                        .expected("WORLD")
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void name() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getM(), aCase.getMusicinfos()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}