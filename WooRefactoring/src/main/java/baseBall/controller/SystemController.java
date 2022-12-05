package baseBall.controller;

import baseBall.model.ComputerNumber;
import baseBall.model.Referee;
import baseBall.model.UserNumber;
import baseBall.view.MESSAGE;
import baseBall.view.OutputView;

public class SystemController {
    private final OutputView OUTPUT_VIEW = new OutputView();
    private final InputView INPUT_VIEW = new InputView();
    private final UserNumber USER_NUMBER = new UserNumber();
    private final ComputerNumber COMPUTER_NUMBER = new ComputerNumber();
    private final Referee REFEREE = new Referee();

    private boolean win = false;

    public void play() {
        computer();
        System.out.println(COMPUTER_NUMBER.getComputerNumbers());
        enter();
        retry();
    }

    private void enter() {
        user();
        referee();
        result();
    }

    private void retry() {
        System.out.println(MESSAGE.COMMAND.getView());
        if (true) {
            play();
        }
        if (false) {
            //종료
        }
    }

    private void user() {
        OUTPUT_VIEW.printInput();
        INPUT_VIEW.readNumber();
        USER_NUMBER.makeUserNumbers(INPUT_VIEW.getInputNumber());
    }

    private void computer() {
        COMPUTER_NUMBER.makeComputerNumbers();
        OUTPUT_VIEW.printStart();
    }

    private void referee() {
        REFEREE.setUserNumbers(USER_NUMBER.getUserNumbers());
        REFEREE.setComputerNumbers(COMPUTER_NUMBER.getComputerNumbers());

        REFEREE.playBaseBall();
        OUTPUT_VIEW.printResult(REFEREE.getResult());
    }

    private void result() {
        if (REFEREE.getStrike() != 3) {
            enter();
        }
    }


}
