package Programmers.twenty.Four.Day;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgrammersLv0_AtoB {
    public static void main(String[] args) {
        String before = "olleh";
        String after = "hello";
        /*
         * A로 B 만들기
         */
        int answer = 0;
        List<String> str1 = new ArrayList<>();
        List<String> str2 = new ArrayList<>();

        for (int i = 0; i < before.length(); i++) {
            str1.add(String.valueOf(before.charAt(i)));
        }

        for (int i = 0; i < after.length(); i++) {
            str2.add(String.valueOf(after.charAt(i)));
        }
        Collections.sort(str1);
        Collections.sort(str2);

        if (str1.equals(str2)) {
            answer = 1;
        }
    }
}