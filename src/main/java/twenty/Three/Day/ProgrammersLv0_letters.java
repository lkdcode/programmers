package twenty.Three.Day;

public class ProgrammersLv0_letters {
    public static void main(String[] args) {
        String my_string = "abCdEfghIj";
        /*
         * 대문자와 소문자
         */
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) >= 65 && my_string.charAt(i) <= 90) {
                answer += (char) (my_string.charAt(i) + 32);
            }
            if (my_string.charAt(i) >= 97 && my_string.charAt(i) <= 122) {
                answer += (char) (my_string.charAt(i) - 32);
            }
        }
    }
}