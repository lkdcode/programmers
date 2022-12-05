package baseBall.controller;

import static camp.nextstep.edu.missionutils.Console.readLine;

/*
 *  사용자로부터 입력을 받는 클래스
 */
public class InputView {
    private final ValidateInput VALIDATE_INPUT = new ValidateInput();
    private String inputCommand;
    private String inputNumber;

    // 사용자로부터 숫자를 입력받는 메소드
    public void readNumber() {
        inputNumber = readLine();
        VALIDATE_INPUT.validateInputNumber(inputNumber);
    }

    public String getInputNumber() {
        return inputNumber;
    }

    // 사용자로부터 재시작,종료 여부를 입력받는 메소드
    public void readCommand() {
        inputCommand = readLine();
    }

}
