package twenty.Four.Day;

public class ProgrammersLv0_PlanetAge {
    public static void main(String[] args) {
        int age = 23;
        /*
         * 외계 행성의 나이
         */

        String str = String.valueOf(age);
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            answer += (char) (str.charAt(i) + 49);
        }

    }
}