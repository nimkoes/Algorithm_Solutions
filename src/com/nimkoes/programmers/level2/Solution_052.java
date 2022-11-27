package com.nimkoes.programmers.level2;

import java.util.Arrays;
import java.util.HashSet;

public class Solution_052 {

    private static final int BOUNDARY = 5;
    private HashSet<String> history = new HashSet<>();

    // 캐릭터 이동시 좌표 이동 위치
    enum Move {
        U(0, 1), D(0, -1), L(-1, 0), R(1, 0);

        int x, y;

        Move(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public static Move find(String action) {
            return Arrays.stream(Move.values())
                    .filter(elem -> elem.name().equals(action))
                    .findFirst()
                    .get();
        }
    }

    class Character {
        private int x = 0;
        private int y = 0;

        public void moveAndSave(Move move) {
            int new_x = this.x + move.getX();
            int new_y = this.y + move.getY();

            // 범위를 벗어나면 제자리
            if (Math.abs(new_x) > BOUNDARY || Math.abs(new_y) > BOUNDARY) return;

            save(this.x, this.y, new_x, new_y);
            this.x = new_x;
            this.y = new_y;
        }

        /**
         * 출발 -> 도착 정보와
         * 도착 -> 출발 정보를 모두 저장
         */
        private void save(int x, int y, int new_x, int new_y) {
            String dep = "" + x + y + new_x + new_y;
            String arr = "" + new_x + new_y + x + y;

            if (!history.contains(dep)) {
                history.add(dep);
                history.add(arr);
            }
        }
    }

    public int solution(String dirs) {

        Character myCharacter = new Character();
        for (String action : dirs.split("")) {
            myCharacter.moveAndSave(Move.find(action));
        }

        // history 에는 왕복 정보가 저장되어 있으므로 2로 나눠줘야 한다.
        return history.size() / 2;
    }
}
