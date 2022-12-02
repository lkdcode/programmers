package Programmers.twenty.Four.Day;

import java.util.ArrayList;
import java.util.List;

public class ProgrammersLv0_RemoveStrings {
    public static void main(String[] args) {
        String my_string = "people";
        /*
         * 중복된 문자 제거
         */

        List<String> list = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++) {
            if (!(list.contains(String.valueOf(my_string.charAt(i))))) {
                list.add(String.valueOf(my_string.charAt(i)));
            }
        }
        String answer = "";
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }

        System.out.println(answer);
    }
}