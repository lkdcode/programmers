public class ProgrammersLv0_Ranking {
    public static void main(String[] args) {
        int[][] score = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};

        /*
         * 등수 매기기
         */

        int[] totalScore = new int[score.length];
        int[] answer = new int[score.length + 1];


        for (int i = 0; i < score.length; i++) {
            totalScore[i] = score[i][0] + score[i][1];
        }


        System.out.println(totalScore[0]);
        System.out.println(totalScore[1]);
        System.out.println(totalScore[2]);
        System.out.println(totalScore[3]);
        String str = new String();


    }
}