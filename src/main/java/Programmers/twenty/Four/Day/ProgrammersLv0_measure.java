package Programmers.twenty.Four.Day;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgrammersLv0_measure {
    public static void main(String[] args) {
        int n = 16;
        /*
         * 약수 구하기
         */

        int a = (int) Math.sqrt(n);
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= a; i++) {
            if (n % i == 0) {
                list.add(i);
                if (n / i != i) {
                    list.add(n / i);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list);
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }


    }
}