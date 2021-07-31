package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("오픈채팅방")
class _open_chat_room_test {

    @Builder
    @Getter
    static class TestCase {
        String[] record;

        String[] expected;
    }

    _open_chat_room solution;

    @BeforeEach
    void setUp() {
        solution = new _open_chat_room();
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
