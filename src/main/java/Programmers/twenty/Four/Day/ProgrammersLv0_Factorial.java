package Programmers.twenty.Four.Day;

public class ProgrammersLv0_Factorial {
    public static void main(String[] args) {
        int n = 3628800;

        /*
         * 팩토리얼
         */

        int answer = 1;
        int i = 1;
        int j = 0;
        while (true) {
            answer *= i;
            i++;
            if (answer > n) {
                break;
            }
            j++;
        }
        answer = j;
    }
}


