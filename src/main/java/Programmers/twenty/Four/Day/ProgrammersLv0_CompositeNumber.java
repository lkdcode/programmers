package Programmers.twenty.Four.Day;

public class ProgrammersLv0_CompositeNumber {
    public static void main(String[] args) {
        int n = 10;
        /*
         * 제목 기입
         */
        int answer = 0;

        for (int i = 4; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count >= 3) {
                answer++;
            }
        }

    }
}