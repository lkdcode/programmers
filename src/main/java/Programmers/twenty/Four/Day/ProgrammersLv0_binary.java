package Programmers.twenty.Four.Day;

import java.math.BigInteger;

public class ProgrammersLv0_binary {
    public static void main(String[] args) {
        String bin1 = "10";
        String bin2 = "11";
        /*
         * 이진수 더하기
         */

        BigInteger num1 = new BigInteger(bin1, 2);
        BigInteger num2 = new BigInteger(bin2, 2);
        BigInteger number = num1.add(num2);

        String answer = number.toString(2);

    }
}