package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("신고 결과 받기")
class _get_report_resultsTest {

    @Builder
    @Getter
    static class TestCase {
        String[] id_list;
        String[] report;
        int k;

        int[] expected;
    }

    _get_report_results solution;

    @BeforeEach
    void setUp() {
        solution = new _get_report_results();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .id_list(new String[]{"muzi", "frodo", "apeach", "neo"})
                .report(new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"})
                .k(2)
                .expected(new int[]{2, 1, 1, 0})
                .build();

        assertThat(solution.solution(testCase.getId_list(), testCase.getReport(), testCase.getK()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .id_list(new String[]{"con", "ryan"})
                .report(new String[]{"ryan con", "ryan con", "ryan con", "ryan con"})
                .k(3)
                .expected(new int[]{0, 0})
                .build();

        assertThat(solution.solution(testCase.getId_list(), testCase.getReport(), testCase.getK()))
                .isEqualTo(testCase.getExpected());
    }
}
