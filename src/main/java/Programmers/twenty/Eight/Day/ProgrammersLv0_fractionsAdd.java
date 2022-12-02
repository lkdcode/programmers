package Programmers.twenty.Eight.Day;

public class ProgrammersLv0_fractionsAdd {
    public static void main(String[] args) {
        int denum1 = 1;
        int num1 = 9;
        int denum2 = 1;
        int num2 = 6;

        /*
         * 분수의 덧셈
         */

        int x = (denum1 * num2) + (denum2 * num1);
        int y = num1 * num2;


        int gcd = gcd(x, y);

        int number1 = x / gcd;
        int number2 = y / gcd;

        int[] answer = {number1, number2};

        System.out.println(answer[0]);
        System.out.println(answer[1]);

    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }


}