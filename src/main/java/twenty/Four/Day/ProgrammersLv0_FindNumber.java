package twenty.Four.Day;

public class ProgrammersLv0_FindNumber {
    public static void main(String[] args) {
        int num = 29183;
        int k = 1;
        /*
         * 숫자 찾기
         */
        String number = String.valueOf(num);
        int answer = -1;

        for (int i = 0; i < number.length(); i++) {
            if (Integer.parseInt(String.valueOf(number.charAt(i))) == k) {
                answer = i + 1;
                break;
            }
        }

    }
}