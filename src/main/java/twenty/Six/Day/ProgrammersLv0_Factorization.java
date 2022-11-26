package twenty.Six.Day;

import java.util.ArrayList;
import java.util.List;

public class ProgrammersLv0_Factorization {
    public static void main(String[] args) {

        int n = 12;

        /*
         * 소인수분해
         * 2로 나눈다........
         * 3으로 나눈다.........
         * 4는 2로 나눠서 없기에 패스된다
         */

        List<Integer> list = new ArrayList<>();
        int i = 2;
        while (i <= n) {
            if (n % i == 0) {
                if (!(list.contains(i))) {
                    list.add(i);
                }
                n /= i;
            }

            if (n % i != 0) {
                i++;
            }
        }

        int[] answer = new int[list.size()];
        for (i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

    }
}