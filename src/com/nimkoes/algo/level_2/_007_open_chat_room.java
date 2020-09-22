package com.nimkoes.algo.level_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class _007_open_chat_room {
    public static void main(String[] ar) {
        _007_open_chat_room simulate = new _007_open_chat_room();
        String[] result = simulate.solution(simulate.getRecord());
        System.out.println(Arrays.toString(result));
    }

    public String[] solution(String[] record) {
        String[] answer = {};

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

        String type = "";
        for(int i = 0; i < record.length; ++i) {
            if(!(type = record[i].split(" ")[0]).equals("Leave"))
                userInfo.put(record[i].split(" ")[1], record[i].split(" ")[2]);

            if(!type.equals("Change"))
                list.add(new Message(record[i].split(" ")[1], type.equals("Enter") ? ENTER : LEAVE));
        }

        answer = new String[list.size()];
        for(int i = 0; i < answer.length; ++i)
            answer[i] = userInfo.get(list.get(i).uid) + list.get(i).message;

        return answer;
    }

    /*
     * SET TEST PARAM
     */

    private String[] record;

    public _007_open_chat_room() {
        record = new String[] {
                "Enter uid1234 Muzi"
                , "Enter uid4567 Prodo"
                , "Leave uid1234"
                , "Enter uid1234 Prodo"
                , "Change uid4567 Ryan"
        };
    }

    public String[] getRecord() {
        return record;
    }
}
