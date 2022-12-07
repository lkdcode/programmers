package lotto.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.Collections;
import java.util.List;

public class MakeUserLotto {
//✨feat : 유저의 로또 번호를 생성하는 클래스
    private List<Integer> numbers;

    public MakeUserLotto() {
        this.numbers = Randoms.pickUniqueNumbersInRange(1, 45, 6);
        Collections.sort(numbers);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
