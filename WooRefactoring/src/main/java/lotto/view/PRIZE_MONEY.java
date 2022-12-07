package lotto.view;
//✨feat : 등수와 당첨금 이넘 클래스
public enum PRIZE_MONEY {
    SIX_CONTAINS("1", 2_000_000_000),
    FIVE_BONUS_CONTAINS("2", 30_000_000),
    FIVE_CONTAINS("3", 1_500_000),
    FOUR_CONTAINS("4", 50_000),
    THREE_CONTAINS("5", 5_000);
    String win;
    int prizeMoney;

    PRIZE_MONEY(String win, int prizeMoney) {
        this.win = win;
        this.prizeMoney = prizeMoney;
    }
}
