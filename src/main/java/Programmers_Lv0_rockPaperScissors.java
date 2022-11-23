
public class Programmers_Lv0_rockPaperScissors {
    public static void main(String[] args) {
        String rsp = "205";
        ///////////////////
        /*
         * 가위 바위 보
         */
        ///////////////////
        String answer = "";
        for (int i = 0; i < rsp.length(); i++) {
            if (rsp.charAt(i) == '0') {
                answer += String.valueOf('5');
            }
            if (rsp.charAt(i) == '2') {
                answer += String.valueOf('0');
            }
            if (rsp.charAt(i) == '5') {
                answer += String.valueOf('2');
            }
        }

    }
}