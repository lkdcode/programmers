package lotto.view;
//✨feat : 메시지 출력 이넘 클래스
public enum MESSAGE {
    INPUT_MONEY("구입금액을 입력해주세요."),
    LOTTERY("개를 구매했습니다."),
    INPUT_NUMBERS("당첨 번호를 입력해주세요."),
    INPUT_BONUS_NUMBERS("보너스 번호를 입력해주세요."),
    RATE("당첨 통계"),
    LINE("---"),
    THREE_CONTAINS("3개 일치 (5,000원) - "),
    FOUR_CONTAINS("4개 일치 (50,000원) - "),
    FIVE_CONTAINS("5개 일치 (1,500,000원) - "),
    FIVE_BONUS_CONTAINS("5개 일치, 보너스 볼 일치 (30,000,000원) - "),
    SIX_CONTAINS("6개 일치 (2,000,000,000원) - ");
    String view;

    MESSAGE(String view) {
        this.view = view;
    }
}
