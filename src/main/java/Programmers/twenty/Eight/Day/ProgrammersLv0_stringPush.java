package Programmers.twenty.Eight.Day;

public class ProgrammersLv0_stringPush {
    public static void main(String[] args) {
        String A = "hello";
        String B = "ohell";

        /*
         * 문자열 밀기
         */

        String str = A;
        int answer = -1;

        for (int i = 0; i < A.length(); i++) {
            str = A;
            if (str.equals(B)) {
                answer = i;
                break;
            }
            A = str.substring(str.length() - 1);
            A += str.substring(0, str.length() - 1);
        }
        System.out.println(answer);
    }
}
