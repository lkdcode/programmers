package Programmers.twenty.Four.Day;

public class ProgrammersLv0_Cipher {
    public static void main(String[] args) {
        String cipher = "dfjardstddetckdaccccdegk";
        int code = 4;
        /*
         * 암호 해독
         */
        String answer = "";
        for (int i = code; i <= cipher.length(); i += code) {
            System.out.println(i);
            answer += cipher.charAt(i - 1);
        }
    }
}