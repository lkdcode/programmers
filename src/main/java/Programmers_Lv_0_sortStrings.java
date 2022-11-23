import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programmers_Lv_0_sortStrings {
    public static void main(String[] args) {
        String my_string = "hi12392";
        /*
         * 문자열 정렬하기 (1)
         */
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) >= '0' && my_string.charAt(i) <= '9') {
                list.add(Integer.parseInt(String.valueOf(my_string.charAt(i))));
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