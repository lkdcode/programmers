package Programmers.twenty.Seven.Day;

public class ProgrammersLv0_decimal {
    public static void main(String[] args) {

        int a = 7;
        int b = 20;

        /*
         * 유한소수 판별하기
         */

        int num = b / gcd(a, b);

        for (int i = 0; i < b; i++) {

            if (num % 2 == 0) {
                num /= 2;
            }

            if (num % 5 == 0) {
                num /= 5;
            }

        }

        int answer = 2;

        if (num == 1) {
            answer = 1;
        }


    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

}