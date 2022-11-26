package twenty.Six.Day;

public class ProgrammersLv0_cutPaper {
    public static void main(String[] args) {
        int M = 2;
        int N = 5;

        /*
         * 종이 자르기
         */
        int answer = 0;

        if (M > 1) {
            answer += M - 1;
        }
        if (N > 1) {
            answer += (N - 1) * M;
        }

        System.out.println(answer);

    }
}