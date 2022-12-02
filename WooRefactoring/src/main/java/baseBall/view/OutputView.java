package baseBall.view;

public class OutputView {

    /*
     * 유저에게 게임 진행 상황, 결과를 출력하는 클래스
     */

    // 유저에게 게임 시작을 알리는 메소드
    public void printStart() {
        System.out.println(MESSAGE.START.getView());
    }

    // 유저에게 입력하라는 메시지
    public void printInput() {
        System.out.println(MESSAGE.INPUT_NUMBER.getView());
    }

    // 유저에게 결과 값을 보여주는 메소드
    public void printResult() {

    }

    // 승리, 게임 종료 메시지
    public void printWin() {
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
