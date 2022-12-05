package baseBall.controller;

import baseBall.view.MESSAGE;

public class ValidateInput {
    private String userInput;

    /*
     *  입력받은 값을 검증하는 클래스
     */

    public void validateInputNumber(String userInput) {
        this.userInput = userInput;
        validateLength();
        validateNumber();
        validateZero();
        validateDuplication();
    }

    private void validateLength() {
        if (userInput.length() != 3) {
            System.out.println(MESSAGE.ERROR_NUMBER_LENGTH.getView());
            throw new IllegalArgumentException();
        }
    }

    private void validateNumber() {
        if (!(userInput.matches("^[0-9]*$"))) {
            System.out.println(MESSAGE.ERROR_NUMBER.getView());
            throw new IllegalArgumentException();
        }
    }

    private void validateZero() {
        if (userInput.contains("0")) {
            System.out.println(MESSAGE.ERROR_ZERO_NUMBER.getView());
            throw new IllegalArgumentException();
        }
    }

    private void validateDuplication() {
        if (userInput.charAt(0) == userInput.charAt(1) ||
          userInput.charAt(0) == userInput.charAt(2) ||
          userInput.charAt(1) == userInput.charAt(2)) {
            System.out.println(MESSAGE.ERROR_DUPLICATION_NUMBER.getView());
            throw new IllegalArgumentException();
        }
    }


}