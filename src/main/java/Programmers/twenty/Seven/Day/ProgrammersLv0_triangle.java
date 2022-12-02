package Programmers.twenty.Seven.Day;

import java.util.ArrayList;
import java.util.List;

public class ProgrammersLv0_triangle {
    public static void main(String[] args) {
        int[] sides = {11, 7};

        /*
         * 삼각형의 완성조건 (2)
         */

        int answer = 0;

        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= max; i++) {
            if ((i + min) > max) {
                list.add(i);
            }
        }
        System.out.println(list);

        for (int i = max + 1; i < max + min; i++) {
            list.add(i);
        }
        System.out.println(list);
        answer = list.size();

    }
}