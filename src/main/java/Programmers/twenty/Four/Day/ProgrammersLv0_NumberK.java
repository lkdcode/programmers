package Programmers.twenty.Four.Day;

public class ProgrammersLv0_NumberK {
    public static void main(String[] args) {
        int i = 1;
        int j = 13;
        int k = 1;
        /*
         * K의 갯수
         */

        int answer = 0;

        String str = "";
        for (; i <= j; i++) {
            str += String.valueOf(i);
        }
        for (int m = 0; m < str.length(); m++) {
            if (String.valueOf(str.charAt(m)).equals(String.valueOf(k))) {
                answer++;
            }
        }
    }

}