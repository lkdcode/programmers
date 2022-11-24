package twenty.Four.Day;

import java.util.ArrayList;
import java.util.List;

public class ProgrammersLv0_RotateArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};

        String direction = "left";
        /*
         * 배열 회전시키기
         */
        List<Integer> list = new ArrayList<>();
        if (direction.length() == 5) {
            list.add(numbers[numbers.length - 1]);
        }
        for (int i = 0; i < numbers.length - 1; i++) {
            if (direction.length() == 5) {
                list.add(numbers[i]);
            }
            if (direction.length() == 4) {
                list.add(numbers[i + 1]);
            }
        }
        if (direction.length() == 4) {
            list.add(numbers[0]);
        }
        int[] answer = new int[numbers.length];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

    }
}