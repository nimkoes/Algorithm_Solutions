package com.nimkoes.programmers.level3;

import java.util.*;

public class _best_album {

    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> hm_genre = new HashMap<>();
        TreeMap<Integer, String> sorted_genre = new TreeMap<>(Collections.reverseOrder());

        HashMap<String, TreeMap<Integer, Integer>> hm_album = new HashMap<>();

        for (int i = 0; i < genres.length; ++i) {
            hm_genre.put(genres[i], hm_genre.getOrDefault(genres[i], 0) + plays[i]);

            int duplicate = 0;
            if (!hm_album.containsKey(genres[i])) {
                hm_album.put(genres[i], hm_album.getOrDefault(genres[i], new TreeMap<>(Collections.reverseOrder())));
            } else if (hm_album.get(genres[i]).containsKey(plays[i])) {
                while (hm_album.get(genres[i]).containsKey((plays[i] + duplicate))) --duplicate;
            }
            TreeMap<Integer, Integer> temp = hm_album.get(genres[i]);
            temp.put(plays[i] + duplicate, i);
        }
        hm_genre.forEach((s, i) -> sorted_genre.put(i, s));

        List<Integer> result = new ArrayList<>();
        sorted_genre.forEach((i, s) -> {
            int size = hm_album.get(s).size();
            for (int index = 0; (index < size && index < 2); ++index) {
                result.add(hm_album.get(s).firstEntry().getValue());
                hm_album.get(s).remove(hm_album.get(s).firstEntry().getKey());
            }
        });

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
