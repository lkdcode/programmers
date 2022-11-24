package twenty.Four.Day;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgrammersLv0_SortStrings2 {
    public static void main(String[] args) {
        String my_string = "Bcad";
        /*
         * 문자열 정렬하기(2)
         */

        String str1 = my_string.toLowerCase();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            list.add(String.valueOf(str1.charAt(i)));
        }
        Collections.sort(list);
        String answer = "";
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }
    }
}