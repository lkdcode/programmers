package baseBall.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class ComputerNumber {
    private List<Integer> computerNumbers = new ArrayList<>();
    private final ValidateComputerNumbers VALIDATE_COMPUTER_NUMBERS = new ValidateComputerNumbers();

    public void makeComputerNumbers() {
        while (computerNumbers.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computerNumbers.contains(randomNumber)) {
                computerNumbers.add(randomNumber);
            }
        }
        validateComputerNumbers();
    }

    private void validateComputerNumbers() {
        VALIDATE_COMPUTER_NUMBERS.validateComputerNumbers(computerNumbers);
    }

    public List<Integer>

    getComputerNumbers() {
        return computerNumbers;
    }

}
