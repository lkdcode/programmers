package twenty.Four.Day;

import java.util.ArrayList;
import java.util.List;

public class ProgrammersLv0_MorseCode {
    public static void main(String[] args) {
        String letter = ".--. -.-- - .... --- -.";

        /*
         * 모스 부호
         */

        String[] morse = {".-", "a", "-...", "b", "-.-.", "c", "-..", "d", ".", "e", "..-.",
          "f", "--.", "g", "....", "h", "..", "i", ".---", "j", "-.-", "k", ".-..", "l",
          "--", "m", "-.", "n", "---", "o", ".--.", "p", "--.-", "q", ".-.", "r",
          "...", "s", "-", "t", "..-", "u", "...-", "v", ".--", "w", "-..-", "x",
          "-.--", "y", "--..", "z"};

        String[] list = letter.split(" ");
        List<Integer> word = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < morse.length; j += 2) {
                if (list[i].equals(morse[j])) {
                    word.add(j + 1);
                }
            }
        }
        String answer = "";
        for (int i = 0; i < word.size(); i++) {
            System.out.println(morse[word.get(i)]);
            answer += morse[word.get(i)];
        }
    }
}