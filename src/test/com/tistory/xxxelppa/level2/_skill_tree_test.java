package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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

    @BeforeEach
    void setUp() {
        solution = new _skill_tree();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .skill("CBD")
                .skill_trees(new String[]{"BACDE", "CBADF", "AECB", "BDA"})
                .expected(2)
                .build();

        assertThat(solution.solution(testCase.getSkill(), testCase.getSkill_trees()))
                .isEqualTo(testCase.getExpected());
    }
}