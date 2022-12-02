package Programmers.twenty.Four.Day;

public class ProgrammersLv0_FindMaxNumber {
    public static void main(String[] args) {
        int[] array = {9, 10, 11, 8};
        /*
         * 가장 큰 수 찾기
         */
        int maxNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxNumber < array[i]) {
                maxNumber = array[i];
            }
        }
        System.out.println(maxNumber);
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxNumber) {
                index = i;
                break;
            }
        }
        int[] answer = new int[2];
        answer[0] = maxNumber;
        answer[1] = index;
    }
}