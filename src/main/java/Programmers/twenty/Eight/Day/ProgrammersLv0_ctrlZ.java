package Programmers.twenty.Eight.Day;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgrammersLv0_ctrlZ {
    public static void main(String[] args) {

        String s = "1 2 Z Z 3 ";

        /*
         * 컨트롤 제트
         */

        String[] str = s.split(" ");
        List<String> arr = new ArrayList<>(Arrays.asList(str));

        while (arr.contains("Z")) {
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i).equals("Z")) {
                    arr.remove(i);
                    arr.remove(i - 1);
                    i = 0;
                }
            }
        }
        int answer = 0;
        for (int i = 0; i < arr.size(); i++) {
            answer += Integer.parseInt(arr.get(i));
        }

        System.out.println(arr);
    }
}