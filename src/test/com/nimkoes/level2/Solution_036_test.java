package com.nimkoes.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("스킬트리")
class Solution_036_test {

    @Builder
    @Getter
    static class TestCase {
        String skill;
        String[] skill_trees;

        int expected;
    }

    Solution_036 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_036();
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
