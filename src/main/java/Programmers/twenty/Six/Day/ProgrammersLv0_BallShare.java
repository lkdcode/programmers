package Programmers.twenty.Six.Day;

import java.math.BigInteger;

public class ProgrammersLv0_BallShare {
    public static void main(String[] args) {

        int balls = 30;
        int share = 2;

        /*
         * 구슬을 나누는 경우의 수
         */

        BigInteger n = new BigInteger("1");
        BigInteger m = new BigInteger("1");

        for (int i = 1; i <= balls; i++) {
            n = n.multiply(BigInteger.valueOf(i));
        }
        for (int i = 1; i <= share; i++) {
            m = m.multiply(BigInteger.valueOf(i));
        }
        BigInteger nm = new BigInteger("1");
        for (int i = 1; i <= (balls - share); i++) {
            nm = nm.multiply(BigInteger.valueOf(i));
        }

        BigInteger answer = new BigInteger("1");

        answer = n.divide(nm.multiply(m));
        System.out.println(answer);

    }
}