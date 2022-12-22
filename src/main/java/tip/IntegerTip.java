package tip;

import java.util.Arrays;
import java.util.List;

public class IntegerTip {
    public static void main(String[] args) {

        /**
         *  숫자 관련 ····
         */

        // 1 + 2 + 3 을 하고 싶다면?
        int examNumber = 123;

        int result = 0;
        for (int i = 0; i < 3 /* 숫자 길이 만큼 */; i++) {
            result += examNumber %= 10;
            // i = 0;     123 % 10 ->  3
            // i = 1;     12 % 10 ->   2
            // i = 2;     1 % 10 ->    1

            examNumber /= 10;
            // i = 0;     123 / 10 ->  12
            // i = 1;     12 / 10 ->   1
            // i = ;     1 / 10 ->     0
        }


    }

    /*
     *  최대 공약수 gcd
     * */
    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);

        // a % b = r
        // exam) a = 12 , b = 8
        // 12 % 8 = 4
        // 8 % 4 = 0
        // 4 % 0 -> b가 0일 떄, a 값이 gcd
    }

    /*
     *  최소 공배수 lcm
     * */
    private static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }


}
