package com.tistory.xxxelppa.level2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class _just_that_song {
    public String solution(String m, String[] musicinfos) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        
        class MInfo implements Comparable<MInfo> {
            private long playingTime;
            private String name;
            private String sheet_music;
            private int index;
            
            public MInfo(String startTime, String endTime, String name, String sheet_music, int index) {
                try {
                    this.playingTime = (sdf.parse(endTime).getTime() - sdf.parse(startTime).getTime()) / 1000 / 60;
                } catch (ParseException ignored) {
                }
                this.name = name;
                this.sheet_music = makeSheetMusic(playingTime, parsingM(sheet_music));
                this.index = index;
            }
            
            private String makeSheetMusic(long playingTime, String sm) {
                if (sm.length() > playingTime) return sm.substring(0, (int) playingTime);
                
                StringBuilder sb = new StringBuilder();
                int charIndex = 0;
                int size = 0;
                int loopSize = sm.length();
                while (size < playingTime) {
                    sb.append(sm.charAt(charIndex++));
                    ++size;
                    if (loopSize == charIndex) charIndex = 0;
                }
                return sb.toString();
            }
            
            public String getSheet_music() {
                return sheet_music;
            }
            
            public String getName() {
                return name;
            }
            
            @Override
            public int compareTo(MInfo o) {
                if (this.playingTime > o.playingTime) return -1;
                else if (this.playingTime < o.playingTime) return 1;
                else return this.index - o.index;
            }
        }
        
        String answer = "(None)";
        MInfo[] mInfos = new MInfo[musicinfos.length];
        
        int i = 0;
        for (String str : musicinfos) {
            String[] temp = str.split(",");
            mInfos[i] = new MInfo(temp[0], temp[1], temp[2], temp[3], i);
            ++i;
        }
        
        Arrays.sort(mInfos);
        m = parsingM(m);
        for (MInfo info : mInfos) {
            if (info.getSheet_music().contains(m)) return info.getName();
        }
        
        return answer;
    }
    
    public String parsingM(String mStr) {
        mStr = mStr.replace("C#", "c");
        mStr = mStr.replace("D#", "d");
        mStr = mStr.replace("F#", "f");
        mStr = mStr.replace("G#", "g");
        mStr = mStr.replace("A#", "a");
        
        return mStr;
    }
}
