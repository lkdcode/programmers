package twenty.Four.Day;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgrammersLv0_onlyOneStrings {
    public static void main(String[] args) {
        String s = "hello";
        /*
         * 한 번만 등장한 문자
         */

        List<String> str = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            char ch = s.charAt(i);
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ch) {
                    count++;
                }
            }
            if (count <= 1) {
                str.add(String.valueOf(ch));
            }
        }

        System.out.println(str);
        Collections.sort(str);
        String answer = "";
        for (int i = 0; i < str.size(); i++) {
            answer += str.get(i);
        }

    }
}