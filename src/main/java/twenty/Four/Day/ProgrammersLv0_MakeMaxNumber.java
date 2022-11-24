package twenty.Four.Day;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgrammersLv0_MakeMaxNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, -3, 4, -5};
        /*
         * 최댓값 만들기(2)
         */


        // 0,1 0,2 0,3 0,4
        // 1,2 1,3 1,4
        // 2,3 2,4
        // 4,5
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (j == i) {
                    break;
                }
                list.add(numbers[i] * numbers[j]);
            }
        }
        Collections.sort(list);
        System.out.println(list);
        int answer = list.get(list.size() - 1);

    }
}