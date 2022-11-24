package twenty.Four.Day;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgrammersLv0_Treatment {
    public static void main(String[] args) {
        int[] emergency = {3, 76, 24};

        /*
         * 진료 순서 정하기
         */

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < emergency.length; i++) {
            list.add(emergency[i]);
        }

        Collections.sort(list);
        for (int i = list.size() - 1; i >= 0; i--) {
            list2.add(list.get(i));
        }

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if (emergency[i] == list2.get(j)) {
                    arr.add(j + 1);
                }
            }
        }

        System.out.println(arr);
        int[] answer = new int[emergency.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr.get(i);
        }

    }
}