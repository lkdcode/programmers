package Programmers.twenty.Five.Day;

public class ProgrammersLv0_HiddenAdd {
    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";

        /*
         * 숨어있는 숫자의 덧셈 (2)
         */

        String[] num = my_string.replaceAll("[^0-9]", " ").split(" ");

        int answer = 0;
        for (int i = 0; i < num.length; i++) {
            if (!(num[i].equals(""))) {
                answer += Integer.parseInt(num[i]);
            }
        }

    }
}