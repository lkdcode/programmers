package lotto;

import lotto.model.MakeUserLotto;

public class Application {
    public static void main(String[] args) {
        MakeUserLotto makeUserLotto = new MakeUserLotto();

        System.out.println(makeUserLotto.getNumbers());

    }
}
