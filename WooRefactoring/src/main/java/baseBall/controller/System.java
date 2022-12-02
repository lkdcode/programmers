package baseBall.controller;

import baseBall.view.OutputView;

public class System {
    public final OutputView outputView = new OutputView();

    public void System() {
        outputView.printStart();
        outputView.printInput();
        outputView.printResult();
        outputView.printWin();
        outputView.printCommand();
        outputView.printQuit();
    }
}
