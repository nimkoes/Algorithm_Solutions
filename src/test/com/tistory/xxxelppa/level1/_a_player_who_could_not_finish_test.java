package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


@DisplayName("완주하지 못한 선수")
class _a_player_who_could_not_finish_test {

    @Builder
    @Getter
    static class TestCase {
        String[] participant;
        String[] completion;

        String expected;
    }

    _a_player_who_could_not_finish solution;


    @BeforeEach
    void setUp() {
        solution = new _a_player_who_could_not_finish();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .participant(new String[]{"leo", "kiki", "eden"})
                .completion(new String[]{"eden", "kiki"})
                .expected("leo")
                .build();

        assertThat(solution.solution(testCase.getParticipant(), testCase.getCompletion()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .participant(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"})
                .completion(new String[]{"josipa", "filipa", "marina", "nikola"})
                .expected("vinko")
                .build();

        assertThat(solution.solution(testCase.getParticipant(), testCase.getCompletion()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .participant(new String[]{"mislav", "stanko", "mislav", "ana"})
                .completion(new String[]{"stanko", "ana", "mislav"})
                .expected("mislav")
                .build();

        assertThat(solution.solution(testCase.getParticipant(), testCase.getCompletion()))
                .isEqualTo(testCase.getExpected());
    }
}
