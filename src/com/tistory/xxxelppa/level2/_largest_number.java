package com.tistory.xxxelppa.level2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _largest_number {
    public String solution(int[] numbers) {
        List<String> numberz = Arrays.stream(numbers)
                .boxed()
                .map(String::valueOf).sorted((o1, o2) -> (o2 + o1).compareTo(o1 + o2)).collect(Collectors.toList());
    
        return numberz.get(0).equals("0") ? "0" : String.join("", numberz);
    }
}