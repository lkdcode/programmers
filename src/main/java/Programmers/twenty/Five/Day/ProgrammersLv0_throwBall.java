package Programmers.twenty.Five.Day;

import java.util.ArrayList;
import java.util.List;

public class ProgrammersLv0_throwBall {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int k = 5;

        /*
         * 공 던지기
         */

        List<Integer> list = new ArrayList<>();
        int j = 0;
        while (j < k) {
            for (int i = 0; i < numbers.length; i++) {
                list.add(numbers[i]);
            }
            j++;
        }
        List<Integer> kList = new ArrayList<>();
        for (int i = 0; i < k * 2; i += 2) {
            kList.add(i);
        }
        int answer = list.get(kList.get(kList.size() - 1));
    }
}