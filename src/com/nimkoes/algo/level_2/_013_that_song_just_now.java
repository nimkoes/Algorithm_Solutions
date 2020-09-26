package com.nimkoes.algo.level_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class _013_that_song_just_now {

    public String solution(String m, String[] musicinfos) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

        class MInfo implements Comparable<MInfo> {
            private long playingTime;
            private String name;
            private String sheet_music;
            private int index;

            public MInfo(String startTime, String endTime, String name, String sheet_music, int index) {
                try {
                    this.playingTime = (sdf.parse(endTime).getTime() - sdf.parse(startTime).getTime())/1000/60;
                } catch (ParseException e) { }
                this.name = name;
                this.sheet_music = makeSheetMusic(playingTime, parsingM(sheet_music));
                this.index = index;
            }

            private String makeSheetMusic(long playingTime, String sm) {
                if(sm.length() > playingTime) return sm.substring(0, (int)playingTime);

                StringBuilder sb = new StringBuilder();
                int charIndex = 0;
                int size = 0;
                int loopSize = sm.length();
                char ch = ' ';
                while (size < playingTime) {
                    sb.append(ch = sm.charAt(charIndex++));
                    ++size;
                    if(loopSize == charIndex) charIndex = 0;
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
                if(this.playingTime > o.playingTime) return -1;
                else if(this.playingTime < o.playingTime) return 1;
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

    public static void main(String[] ar) {

        /*******************************
         * SET TEST CASE START
         *******************************/
        class _013_that_song_just_now_TEST_ENV {
            private String m;
            private String[] musicinfos;
            private String expectedResult;

            public _013_that_song_just_now_TEST_ENV(String m, String[] musicinfos, String expectedResult) {
                this.m = m;
                this.musicinfos = musicinfos;
                this.expectedResult = expectedResult;
            }

            public String getM() {
                return m;
            }

            public String[] getMusicinfos() {
                return musicinfos;
            }

            public String getExpectedResult() {
                return expectedResult;
            }

            @Override
            public String toString() {
                return "{" +
                        "m='" + m + '\'' +
                        ", musicinfos=" + Arrays.toString(musicinfos) +
                        '}';
            }
        }

        _013_that_song_just_now_TEST_ENV[] env = new _013_that_song_just_now_TEST_ENV[3];
        env[0] = new _013_that_song_just_now_TEST_ENV("ABCDEFG"         , new String[] {"12:00,12:14,HELLO,CDEFGAB" , "13:00,13:05,WORLD,ABCDEF"}    , "HELLO");
        env[1] = new _013_that_song_just_now_TEST_ENV("CC#BCC#BCC#BCC#B", new String[] {"03:00,03:30,FOO,CC#B"      , "04:00,04:08,BAR,CC#BCC#BCC#B"}, "FOO");
        env[2] = new _013_that_song_just_now_TEST_ENV("ABC"             , new String[] {"12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"}    , "WORLD");

        /*******************************
         * SET TEST CASE END
         *******************************/


        /*******************************
         * EXEC TEST
         *******************************/
        _013_that_song_just_now simulate = new _013_that_song_just_now();
        int test_case_no = 1;
        for (_013_that_song_just_now_TEST_ENV tc : env) {
            System.out.println("===========================================================");
            System.out.println(" >>> TEST NO " + test_case_no++);
            System.out.println(" >>> INPUT :: " + tc.toString());
            System.out.println(" >>> EXPECTED RESULT :: " + tc.getExpectedResult());
            System.out.println();

            long startTime = System.currentTimeMillis();
            String result = simulate.solution(tc.getM(), tc.getMusicinfos());
            long endTime = System.currentTimeMillis();

            System.out.println(" >>> MY RESULT :: " + result);
            if(!result.equals(tc.getExpectedResult())) System.out.println(" >>> TEST FAILED !!!!!");
            else System.out.println(" >>> TEST SUCCESS !!!!!");

            System.out.println(" *** EXECUTE TIME :: " + (endTime - startTime) + " (ms)");
            System.out.println("===========================================================");
            System.out.println();
        }
    }
}
