package Programmers.twenty.Eight.Day;

public class ProgrammersLv0_login {
    public static void main(String[] args) {
        String[] id_pw = {"programmer01", "15789"};
        String[][] db = {{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}};
        // 0, 0  0, 1
        // 1, 1
        /*
         * 로그인 성공?
         */

        String answer = "fail";

        for (int i = 0; i < db.length; i++) {

            if (db[i][0].equals(id_pw[0]) && db[i][1].equals(id_pw[1])) {
                answer = "login";
                break;
            }

            if (db[i][0].equals(id_pw[0]) && !(db[i][1].equals(id_pw[1]))) {
                answer = "wrong pw";
            }

        }
        System.out.println(answer);

    }
}