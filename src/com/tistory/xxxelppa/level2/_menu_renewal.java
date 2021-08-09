package com.tistory.xxxelppa.level2;

import java.util.ArrayList;
import java.util.List;

public class _menu_renewal {
    public String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        char[] temp;
    
        List<Boolean[]> orderList = new ArrayList<>();
        
        for (String order : orders) {
            Boolean[] elem = new Boolean[21];
            temp = order.toCharArray();
            
            for (char c : temp) elem[c-65] = true;
            
            orderList.add(elem);
        }
        
        
    
        for (int number_of_single_menu : course) {
        
        }
        
        
        
        return answer;
    }
    
    public static void main(String[] args) {
    
    }
}
