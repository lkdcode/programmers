package baseBall.controller;

import baseBall.model.Referee;
import baseBall.view.OutputView;

public class UserInput {
    private final OutputView OUTPUT_VIEW = new OutputView();
    private final InputView INPUT_VIEW = new InputView();
    private final ValidateInput VALIDATE_INPUT = new ValidateInput();
    private final Referee REFEREE = new Referee();

    public void number() {
        OUTPUT_VIEW.printStart();
        OUTPUT_VIEW.printInput();
        INPUT_VIEW.readNumber();
        VALIDATE_INPUT.setUserInput(INPUT_VIEW.getInputNumber());
        REFEREE.userNumber(VALIDATE_INPUT.getUserInput());
    }

    public void command() {
        OUTPUT_VIEW.printCommand();
    }
}
