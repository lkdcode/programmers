package twenty.Four.Day;

public class ProgrammersLv0_ChangeIndex {
    public static void main(String[] args) {
        String my_string = "hello";
        int num1 = 1;
        int num2 = 2;
        /*
         * 인덱스 바꾸기
         */
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            if (i == num1) {
                answer += my_string.charAt(num2);
                continue;
            }
            if (i == num2) {
                answer += my_string.charAt(num1);
                continue;
            }
            answer += my_string.charAt(i);
        }

    }
}