package com.nimkoes.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution_009 {
    public String[] solution(String[] record) {
        String[] answer;
        
        final String ENTER = "님이 들어왔습니다.";
        final String LEAVE = "님이 나갔습니다.";
        
        class Message {
            private String uid;
            private String message;
            
            Message(String uid, String message) {
                this.uid = uid;
                this.message = message;
            }
        }
        
        List<Message> list = new ArrayList<>();
        HashMap<String, String> userInfo = new HashMap<>();
        
        String type;
        for (String s : record) {
            if (!(type = s.split(" ")[0]).equals("Leave"))
                userInfo.put(s.split(" ")[1], s.split(" ")[2]);
        
            if (!type.equals("Change"))
                list.add(new Message(s.split(" ")[1], type.equals("Enter") ? ENTER : LEAVE));
        }
        
        answer = new String[list.size()];
        for (int i = 0; i < answer.length; ++i)
            answer[i] = userInfo.get(list.get(i).uid) + list.get(i).message;
        
        return answer;
    }
}
