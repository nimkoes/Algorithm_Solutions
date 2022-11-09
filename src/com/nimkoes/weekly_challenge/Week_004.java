package com.nimkoes.weekly_challenge;

import java.util.Arrays;
import java.util.HashMap;

public class Week_004 {

    Integer max = Integer.MIN_VALUE;

    public String solution(String[] table, String[] languages, int[] preference) {
        String answer = "CONTENTS";
        int size = languages.length;
        HashMap<TYPE, Integer> score = new HashMap<>();
        HashMap<LANGUAGES, Integer> preferMap = new HashMap<>();

        Table myTable = Arrays.stream(table).collect(
                Table::new,
                Table::accumulate,
                Table::combine
        );

        for (int i = 0; i < size; ++i) preferMap.put(LANGUAGES.of(languages[i]), preference[i]);

        myTable.getTable().forEach((type, map) -> {
            preferMap.forEach((k, v) -> score.put(type, score.getOrDefault(type, 0) + (map.getOrDefault(k, 0) * v)));
            max = Math.max(max, score.getOrDefault(type, 0));
        });

        for (TYPE type : TYPE.values()) {
            if (score.get(type).equals(max)) {
                return type.toString();
            }
        }

        return answer;
    }

    static class Table {
        private HashMap<TYPE, HashMap<LANGUAGES, Integer>> hm = new HashMap<>();

        public void accumulate(String str) {
            String[] temp = str.split(" ");
            TYPE type = TYPE.valueOf(temp[0]);

            hm.put(type, new HashMap<>());

            for (int i = 1, j = 5; i < temp.length; ++i, --j) {
                hm.get(type).put(LANGUAGES.of(temp[i]), j);
            }
        }

        public void combine(Table t) {
            hm.putAll(t.getTable());
        }

        public HashMap<TYPE, HashMap<LANGUAGES, Integer>> getTable() {
            return hm;
        }
    }

    enum LANGUAGES {
        JAVA("JAVA"),
        JAVASCRIPT("JAVASCRIPT"),
        C("C"),
        CPP("C++"),
        CS("C#"),
        SQL("SQL"),
        PYTHON("PYTHON"),
        KOTLIN("KOTLIN"),
        PHP("PHP");

        private String value;

        LANGUAGES(String value) {
            this.value = value;
        }

        static LANGUAGES of(String language) {
            return Arrays.stream(values())
                    .filter(v -> language.equals(v.value))
                    .findFirst()
                    .orElseThrow(() -> new IllegalArgumentException(String.format("%s not found", language)));
        }
    }

    enum TYPE {
        CONTENTS, GAME, HARDWARE, PORTAL, SI
    }
}
