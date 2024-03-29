package com.nimkoes.programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution_036 {
    public int solution(String skill, String[] skill_trees) {
        int answer;
        ArrayList<String> skillTrees = new ArrayList<>(Arrays.asList(skill_trees));
        
        skillTrees.removeIf(s -> skill.indexOf(s.replaceAll("[^" + skill + "]", "")) != 0);
        answer = skillTrees.size();
        return answer;
    }
}
