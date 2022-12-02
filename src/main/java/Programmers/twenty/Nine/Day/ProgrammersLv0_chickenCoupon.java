package Programmers.twenty.Nine.Day;

public class ProgrammersLv0_chickenCoupon {
    public static void main(String[] args) {
        int chicken = 1089;

        /*
         * 치킨 쿠폰
         */

        int answer = 0;


        while (chicken >= 10) {

            int order = chicken / 10;
            int rest = chicken % 10;

            chicken = order + rest;

            answer += order;
        }


    }
}