package twenty.Four.Day;

public class ProgrammersLv0_369Game {
    public static void main(String[] args) {
        int order = 29423;
        /*
         * 369게임
         */

        String str = String.valueOf(order);
        int answer = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '3' || str.charAt(i) == '6' || str.charAt(i) == '9') {
                answer++;
            }
        }

    }
}