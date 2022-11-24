package twenty.Three.Day;

public class ProgrammersLv0_Ant {
    public static void main(String[] args) {
        int hp = 23;
        /*
         * 개미 군단
         */
        //장군 개미 5
        //병정 개미 3
        //일 개미 1
        int answer = 0;
        while (hp >= 5) {
            System.out.println("dd");
            hp -= 5;
            answer++;
        }
        while (hp >= 3) {
            System.out.println("dd?");
            hp -= 3;
            answer++;
        }
        while (hp >= 1) {
            System.out.println("ddd?");
            hp -= 1;
            answer++;
        }
    }
}