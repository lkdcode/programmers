package lotto.controller;

import java.util.ArrayList;
import java.util.List;

import static camp.nextstep.edu.missionutils.Console.readLine;
//✨feat : 유저로부터 입력받는 클래스
public class InputView {
    private final String ONLY_NUMBER = "^[1-9]*$";
    private List<Integer> lottoNumbers = new ArrayList<>();
    private int bonusNumber;

    public void intputLottoNumbers() {
        String[] intputLottoNumbers = readLine().split(",");
        validateLottoNumbers(intputLottoNumbers);
        makeLottoNumbers(intputLottoNumbers);
    }

    public void intputBonusNumber() {
        String inputBounsNumber = readLine();
        makeBonusNumber(inputBounsNumber);
        validateBonusNumber();
    }

    private void makeLottoNumbers(String[] inputLottoNumbers) {
        for (int i = 0; i < inputLottoNumbers.length; i++) {
            lottoNumbers.add(Integer.parseInt(inputLottoNumbers[i]));
        }
    }

    private void validateBonusNumber() {
        validateBonusDuplication();
        validateBonusRange();
    }

    private void validateBonusRange() {
        if (bonusNumber >= 1 && bonusNumber <= 45) {
            System.out.println("1에서 45숫자만");
            throw new IllegalArgumentException();
        }
    }

    private void validateBonusDuplication() {
        if (lottoNumbers.contains(bonusNumber)) {
            System.out.println("당첨 번호와 중복된 번호는 불가");
            throw new IllegalArgumentException();
        }
    }

    private void makeBonusNumber(String inputBounsNumber) {
        try {
            this.bonusNumber = Integer.parseInt(inputBounsNumber);
        } catch (NumberFormatException e) {
            System.out.println("번호만 입ㄹ겨");
            throw new IllegalArgumentException();
        }
    }

    private void validateLottoNumbers(String[] intputLottoNumbers) {
        makeBonusNumber(intputLottoNumbers);
        validateDuplication(intputLottoNumbers);
        validateLength(intputLottoNumbers);
    }

    private void makeBonusNumber(String[] intputLottoNumbers) {
        for (int i = 0; i < intputLottoNumbers.length; i++) {
            if (!(intputLottoNumbers[i].matches(ONLY_NUMBER))) {
                System.out.println("숫자만 입력해주세요.");
                throw new IllegalArgumentException();
            }
        }
    }

    private void validateDuplication(String[] lottoNumbers) {
        // 중복된 숫자...........................
        // 0 1 2 3 4 5
        // 1 2 3 4 5
        // 2 3 4 5
        // 3 4 5
        // 4 5
    }

    private void validateLength(String[] intputLottoNumbers) {
        if (intputLottoNumbers.length != 6) {
            System.out.println("6개의 숫자를 입력해주세요.");
            throw new IllegalArgumentException();
        }
    }

}
