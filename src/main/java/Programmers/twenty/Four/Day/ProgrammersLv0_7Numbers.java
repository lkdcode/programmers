package Programmers.twenty.Four.Day;

public class ProgrammersLv0_7Numbers {
    public static void main(String[] args) {
        int[] array = {7, 77, 17};
        /*
         * 7의 개수
         */
        String str = "";
        for (int i = 0; i < array.length; i++) {
            str += (String.valueOf(array[i]));
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '7') {
            }
        }

    }
}