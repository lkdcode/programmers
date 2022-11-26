package twenty.Six.Day;

public class ProgrammersLv0_alienLanguage {
    public static void main(String[] args) {
        String[] spell = {"p", "o", "s"};
        String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};

        /*
         * 외계어 사전
         */

        int answer = 2;

        for (String dics : dic) {

            boolean word = true;

            for (String spells : spell) {

                if (dics.indexOf(spells) == -1) {
                    word = false;
                    break;
                }

            }

            if (word) {
                answer = 1;
                break;
            }

        }


    }
}
