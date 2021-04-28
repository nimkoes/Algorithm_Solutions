package com.tistory.xxxelppa.level1;

import static org.assertj.core.api.Assertions.assertThat;

import lombok.Builder;
import lombok.Getter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


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
    ArrayList<TestCase> testCase;
    
    
    @BeforeEach
    void setUp() {
        solution = new _a_player_who_could_not_finish();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .participant(new String[]{"leo", "kiki", "eden"})
                        .completion(new String[]{"eden", "kiki"})
                        .expected("leo")
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .participant(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"})
                        .completion(new String[]{"josipa", "filipa", "marina", "nikola"})
                        .expected("vinko")
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .participant(new String[]{"mislav", "stanko", "mislav", "ana"})
                        .completion(new String[]{"stanko", "ana", "mislav"})
                        .expected("mislav")
                        .build()
        );
        
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void solution() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getParticipant(), aCase.getCompletion()))
                    .isEqualTo(aCase.getExpected());
        }
    }
    
}
