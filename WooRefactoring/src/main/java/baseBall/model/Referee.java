package baseBall.model;

import java.util.ArrayList;
import java.util.List;

public class Referee {
    /*
     *  야구 게임을 관리하는 클래스
     */
    private List<Integer> userNumbers = new ArrayList<>();
    private List<Integer> computerNumbers = new ArrayList<>();
    private List<Integer> result = new ArrayList<>();
    private int strike = 0;
    private int ball = 0;
    private int nothing = 0;
    private int nothingCount = 0;

    public void playBaseBall() {
        setPlay();
        rule();
    }

    public List<Integer> getResult() {
        return result;
    }

    public int getStrike() {
        return strike;
    }

    public void setUserNumbers(List<Integer> userNumbers) {
        this.userNumbers = userNumbers;
    }

    public void setComputerNumbers(List<Integer> computerNumbers) {
        this.computerNumbers = computerNumbers;
    }

    private void rule() {
        nothingRule();
        strikeRule();
        ballRule();
        makeResult();
    }

    private void setPlay() {
        strike = 0;
        ball = 0;
        nothingCount = 0;
        nothing = 0;
        result = new ArrayList<>();
    }

    private void makeResult() {
        result.add(nothing);
        result.add(strike);
        result.add(ball);
    }

    private void strikeRule() {
        for (int i = 0; i < userNumbers.size(); i++) {
            if (userNumbers.get(i) == computerNumbers.get(i)) {
                strike++;
            }
        }
    }

    private void ballRule() {
        for (int i = 0; i < userNumbers.size(); i++) {
            if (userNumbers.get(i) != computerNumbers.get(i)
              && computerNumbers.contains(userNumbers.get(i))) {
                ball++;
            }
        }
    }

    private void nothingRule() {
        for (int i = 0; i < userNumbers.size(); i++) {
            if (!(computerNumbers.contains(userNumbers.get(i)))) {
                nothingCount++;
            }
        }
        if (nothingCount == 3) {
            nothing++;
        }
    }

}
