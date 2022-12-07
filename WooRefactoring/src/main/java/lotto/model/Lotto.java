package lotto.model;

import java.util.List;
/*
 * 입력받은 로또 당첨 번호를 검증하는 클래스
 */
public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        validateSize(numbers);
        validateDuplication(numbers);
        validateNumber(numbers);
    }

    private void validateSize(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    private void validateDuplication(List<Integer> numbers) {
        // 중복된 숫자...............검증
        // 중복된 숫자...............검증
        // 중복된 숫자...............검증
        // 중복된 숫자...............검증
        for (int i = 0; i < numbers.size(); i++) {

        }

    }

    private void validateNumber(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) >= 1 && numbers.get(i) <= 9) {
                throw new IllegalArgumentException();
            }
        }
    }
}
