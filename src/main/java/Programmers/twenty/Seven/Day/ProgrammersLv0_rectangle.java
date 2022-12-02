package Programmers.twenty.Seven.Day;

public class ProgrammersLv0_rectangle {
    public static void main(String[] args) {
        int[][] dots = {{-1, -1}, {1, 1}, {1, -1}, {-1, 1}};

        /*
         * 직사각형의 넓이 구하기
         */

        int maxX = dots[0][0];
        int minX = dots[0][0];
        int maxY = dots[0][1];
        int minY = dots[0][1];

        for (int i = 0; i < dots.length - 1; i++) {
            maxX = Math.max(maxX, dots[i][0]);
            minX = Math.min(minX, dots[i][0]);
            minY = Math.min(minY, dots[i][1]);
            maxY = Math.max(maxY, dots[i][1]);
        }
        int x = maxX - minX;
        int y = maxY - minY;
        int answer = x * y;

    }
}