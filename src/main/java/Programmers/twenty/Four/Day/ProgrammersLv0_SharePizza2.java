package Programmers.twenty.Four.Day;

public class ProgrammersLv0_SharePizza2 {
    public static void main(String[] args) {
        int n = 10;
        /*
         * 피자 나눠 먹기 (2)
         */
        int pizza = 6;
        int num1 = 0;
        int num2 = 0;

        if (n > pizza) {
            num1 = n;
            num2 = pizza;
        }
        if (pizza > n) {
            num1 = pizza;
            num2 = n;
        }
        if (pizza == n) {
            num1 = n;
            num2 = pizza;
        }

        while (num2 != 0) {
            int r = num1 % num2;
            num1 = num2;
            num2 = r;
        }
        int answer = ((n * pizza) / num1) / pizza;
    }
}