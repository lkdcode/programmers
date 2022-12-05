package baseBall.model;

import baseBall.view.MESSAGE;

import java.util.ArrayList;
import java.util.List;

public class ValidateComputerNumbers {
    private List<Integer> computerNumbers = new ArrayList<>();

    public void validateComputerNumbers(List<Integer> computerNumbers) {
        this.computerNumbers = computerNumbers;
        validateLength();
        validateZero();
        validateDuplication();
    }


    private void validateLength() {
        if (computerNumbers.size() != 3) {
            System.out.println(MESSAGE.ERROR_COMPUTER_LENGTH.getView());
            throw new IllegalArgumentException();
        }
    }

    private void validateZero() {
        if (computerNumbers.contains(0)) {
            System.out.println(MESSAGE.ERROR_COMPUTER_ZERO.getView());
            throw new IllegalArgumentException();
        }
    }

    private void validateDuplication() {
        if (computerNumbers.get(0) == computerNumbers.get(1) || computerNumbers.get(0) == computerNumbers.get(2) || computerNumbers.get(1) == computerNumbers.get(2)) {
            System.out.println(MESSAGE.ERROR_COMPUTER_DUPLICATION.getView());
            throw new IllegalArgumentException();
        }
    }
}
