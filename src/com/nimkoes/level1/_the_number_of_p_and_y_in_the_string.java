package com.nimkoes.level1;

public class _the_number_of_p_and_y_in_the_string {
    boolean solution(String s) {
        int size = s.length();
        int sum = 0;
        
        for (int i = 0; i < size; ++i) {
            char c = s.charAt(i);
            if (c == 'p' || c == 'P') ++sum;
            else if (c == 'y' || c == 'Y') --sum;
        }
        
        return sum == 0 ? true : false;
    }
}
