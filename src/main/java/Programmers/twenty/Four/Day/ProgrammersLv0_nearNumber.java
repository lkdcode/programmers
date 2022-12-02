package Programmers.twenty.Four.Day;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgrammersLv0_nearNumber {
    public static void main(String[] args) {
        int[] array = {10, 11, 12};

        int n = 13;

        /*
         * 가까운 수
         */

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }

        Collections.sort(list);

        int answer = 0;
        for (int i = 0; i < list.size(); i++) {
            // i 번째와 n 이 같다면
            // answer = n 이 되고 종료
            if (list.get(i) == n) {
                answer = n;
                break;
            }

            // n보다 큰 수가 등장할 경우
            // i 번째와 i - 1 번째를 비교해서 더 가까운 수를 answer 로 선언하면 된다.....
            if (list.get(i) > n) {
                int num1 = list.get(i) - n;
                int num2 = list.get(i - 1) - n;
                num1 = Math.abs(num1);
                num2 = Math.abs(num2);

                if (num1 == num2) {
                    answer = list.get(i - 1);
                    break;
                }

                if (num1 > num2) {
                    answer = list.get(i - 1);
                    break;
                }
                if (num1 < num2) {
                    answer = list.get(i);
                    break;
                }
            }
            // n보다 큰 수가 등장하지 않는다면
            // 맨 마지막 숫자를 answer 로 선언 후 종료
            if (i == list.size() - 1) {
                answer = list.get(i);
                break;
            }
        }
        System.out.println(answer);

    }
}