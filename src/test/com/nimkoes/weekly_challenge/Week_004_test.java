package com.nimkoes.weekly_challenge;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Week 004")
class Week_004_test {

    @Builder
    @Getter
    static class TestCase {
        String[] table;
        String[] languages;
        int[] preference;

        String expected;
    }

    Week_004 solution;

    @BeforeEach
    void setUp() {
        solution = new Week_004();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .table(new String[]{
                                "SI JAVA JAVASCRIPT SQL PYTHON C#",
                                "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++",
                                "HARDWARE C C++ PYTHON JAVA JAVASCRIPT",
                                "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP",
                                "GAME C++ C# JAVASCRIPT C JAVA"
                        }
                )
                .languages(new String[]{"PYTHON", "C++", "SQL"})
                .preference(new int[]{7, 5, 5})
                .expected("HARDWARE")
                .build();

        assertThat(solution.solution(testCase.getTable(), testCase.getLanguages(), testCase.getPreference()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .table(new String[]{
                                "SI JAVA JAVASCRIPT SQL PYTHON C#",
                                "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++",
                                "HARDWARE C C++ PYTHON JAVA JAVASCRIPT",
                                "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP",
                                "GAME C++ C# JAVASCRIPT C JAVA"
                        }
                )
                .languages(new String[]{"JAVA", "JAVASCRIPT"})
                .preference(new int[]{7, 5})
                .expected("PORTAL")
                .build();

        assertThat(solution.solution(testCase.getTable(), testCase.getLanguages(), testCase.getPreference()))
                .isEqualTo(testCase.getExpected());
    }

}
