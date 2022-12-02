package Programmers.twenty.Six.Day;

import java.util.ArrayList;
import java.util.List;

public class ProgrammersLv0_Stringcal {
    public static void main(String[] args) {
        String my_string = "3 + 44 - 15 + 5";
        /*
         * 문자열 계산하기
         */
        int answer = 0;
        String[] str = my_string.split(" ");
        List<Integer> numbers = new ArrayList<>();
        List<String> cal = new ArrayList<>();

        for (int i = 0; i < str.length; i++) {
            if (!(str[i].equals("+")) && !(str[i].equals("-"))) {
                numbers.add(Integer.parseInt(str[i]));
            }
            if (str[i].equals("+") || str[i].equals("-")) {
                cal.add(str[i]);
            }
        }

        System.out.println(numbers);
        System.out.println(cal);
        answer = numbers.get(0);

        for (int i = 0; i < numbers.size() - 1; i++) {
            if (cal.get(i).equals("+")) {
                answer += numbers.get(i + 1);
            }

            if (cal.get(i).equals("-")) {
                answer -= numbers.get(i + 1);
            }
        }

    }
}