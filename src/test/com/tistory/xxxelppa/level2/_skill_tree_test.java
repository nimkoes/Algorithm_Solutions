package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("스킬트리")
class _skill_tree_test {
    
    @Builder
    @Getter
    static class TestCase {
        String skill;
        String[] skill_trees;
        
        int expected;
    }
    
    _skill_tree solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _skill_tree();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .skill("CBD")
                        .skill_trees(new String[]{"BACDE", "CBADF", "AECB", "BDA"})
                        .expected(2)
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void name() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getSkill(), aCase.getSkill_trees()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}