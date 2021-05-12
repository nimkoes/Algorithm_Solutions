package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("후보키")
class _candidate_key_test {

    @Builder
    @Getter
    static class TestCase {
        String[][] relation;

        int expected;
    }

    _candidate_key solution;

    @BeforeEach
    void setUp() {
        solution = new _candidate_key();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .relation(new String[][]{{"100", "ryan", "music", "2"}, {"200", "apeach", "math", "2"}, {"300", "tube", "computer", "3"}, {"400", "con", "computer", "4"}, {"500", "muzi", "music", "3"}, {"600", "apeach", "music", "2"}})
                .expected(2)
                .build();

        assertThat(solution.solution(testCase.getRelation()))
                .isEqualTo(testCase.getExpected());
    }
}