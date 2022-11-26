package twenty.Six.Day;

import java.util.ArrayList;
import java.util.List;

public class ProgrammersLv0_cutArray {
    public static void main(String[] args) {
        String my_str = "abc1Addfggg4556b";
        //              16
        //              0   1   2   3    4   5
        //              6   7   8   9   10  11
        //             12  13  14  15   16
        int n = 6;

        /*
         * 잘라서 배열로 저장하기
         */

        char[] chars = my_str.toCharArray();
        List<String> list = new ArrayList<>();

        String str = "";

        for (int i = 0; i < chars.length; i++) {
            str += chars[i];
            if (str.length() == n) {
                list.add(str);
                str = "";
            }
        }

        if (!(str.equals(""))) {
            list.add(str);
        }


        System.out.println(list);
        String[] answer = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }


    }
}