package Programmers.twenty.Eight.Day;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgrammersLv0_modeNumber {
    public static void main(String[] args) {
        int[] array = {0, 0, 1, 1, 2, 2, 3, 3};

        /*
         * 최빈값 구하기
         */

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        Collections.sort(list);

        int[] max = new int[(list.get(list.size() - 1)) + 1];

        for (int i = 0; i < list.size(); i++) {
            max[list.get(i)]++;
        }

        int number = 0;
        int index = 0;

        for (int i = 0; i < max.length; i++) {
            if (max[i] > number) {
                number = max[i];
                index = i;
            }
        }
        int answer = index;

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < max.length; i++) {
            arr.add(max[i]);
        }

        Collections.sort(arr);
        if (arr.get(arr.size() - 1) == arr.get(arr.size() - 2)) {
            answer = -1;
        }


    }
}