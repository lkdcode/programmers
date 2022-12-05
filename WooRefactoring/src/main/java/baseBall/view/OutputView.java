package baseBall.view;

import java.util.List;

public class OutputView {
    private final int NOTHING = 0;
    private final int STRIKE = 1;
    private final int BALL = 2;
    /*
     * 유저에게 게임 진행 상황, 결과를 출력하는 클래스
     */

    // 유저에게 게임 시작을 알리는 메소드
    public void printStart() {
        System.out.println(MESSAGE.START.getView());
    }

    // 유저에게 입력하라는 메시지
    public void printInput() {
        System.out.print(MESSAGE.INPUT_NUMBER.getView());
    }

    // 유저에게 결과 값을 보여주는 메소드
    public void printResult(List<Integer> result) {
        printNothig(result.get(NOTHING));
        printStrike(result.get(STRIKE));
        printBall(result.get(BALL));
    }

    private void printNothig(int nothingCount) {
        if (nothingCount != 0) {
            System.out.println(MESSAGE.NOTHING.getView());
        }
    }

    private void printStrike(int strikeCount) {
        if (strikeCount != 0) {
            System.out.print(strikeCount + MESSAGE.STRIKE.getView());
        }
        if (strikeCount == 3) {
            printWin();
        }
    }

    private void printBall(int ballCount) {
        if (ballCount != 0) {
            System.out.println(ballCount + MESSAGE.BALL.getView());
        }
    }

    // 승리, 게임 종료 메시지
    private void printWin() {
        System.out.println(MESSAGE.WIN.getView());
    }

    // 유저에게 게임 재시작, 종료 여부를 보여주는 메소드
    public void printCommand() {
        System.out.println(MESSAGE.COMMAND.getView());
    }

    public void printQuit() {
        System.out.println(MESSAGE.QUIT.getView());
    }
}
