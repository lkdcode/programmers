package twenty.Seven.Day;

public class ProgrammersLv0_Charkey {
    public static void main(String[] args) {
        String[] keyinput = {"left", "left", "left", "left", "left", "left", "left", "right", "down", "down", "down", "down", "down", "down", "down"};
        int[] board = {7, 9};

        /*
         * 캐릭터의 좌표
         */

        // left = -1, 0
        // right = 1, 0
        // up = 0, 1
        // down = 0, -1

        int x = 0;
        int y = 0;

        int limitX = board[0] / 2;
        int limitY = board[1] / 2;

        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("left")) {
                if (Math.abs(x) >= Math.abs(limitX) && x < 0) {
                    continue;
                }
                x -= 1;
            }

            if (keyinput[i].equals("right")) {
                if (Math.abs(x) >= Math.abs(limitX) && x > 0) {
                    continue;
                }
                x += 1;
            }

            if (keyinput[i].equals("up")) {
                if (Math.abs(y) >= Math.abs(limitY) && y > 0) {
                    continue;
                }
                y += 1;
            }

            if (keyinput[i].equals("down")) {
                if (Math.abs(y) >= Math.abs(limitY) && y < 0) {
                    continue;
                }
                y -= 1;
            }

        }

        int[] answer = {x, y};

        System.out.println(x);
        System.out.println(y);
    }
}