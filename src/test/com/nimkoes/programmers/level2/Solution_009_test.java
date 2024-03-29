package com.nimkoes.programmers.level2;

import com.nimkoes.programmers.level2.Solution_009;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("오픈채팅방")
class Solution_009_test {

    @Builder
    @Getter
    static class TestCase {
        String[] record;

        String[] expected;
    }

    Solution_009 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_009();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .record(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"})
                .expected(new String[]{"Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."})
                .build();

        assertThat(solution.solution(testCase.getRecord()))
                .isEqualTo(testCase.getExpected());
    }
}
