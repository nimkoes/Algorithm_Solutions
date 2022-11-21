package com.nimkoes.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("방금그곡")
class Solution_038_test {

    @Builder
    @Getter
    static class TestCase {
        String m;
        String[] musicinfos;

        String expected;
    }

    Solution_038 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_038();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .m("ABCDEFG")
                .musicinfos(new String[]{"12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"})
                .expected("HELLO")
                .build();

        assertThat(solution.solution(testCase.getM(), testCase.getMusicinfos()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .m("CC#BCC#BCC#BCC#B")
                .musicinfos(new String[]{"03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B"})
                .expected("FOO")
                .build();

        assertThat(solution.solution(testCase.getM(), testCase.getMusicinfos()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .m("ABC")
                .musicinfos(new String[]{"12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"})
                .expected("WORLD")
                .build();

        assertThat(solution.solution(testCase.getM(), testCase.getMusicinfos()))
                .isEqualTo(testCase.getExpected());
    }
}
