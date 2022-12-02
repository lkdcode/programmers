package baseBall.view;

public enum MESSAGE {
    START("⚾ 숫자 야구 게임을 시작하겠습니다. ⚾"),
    INPUT_NUMBER("🎯 숫자를 입력해주세요 : "),
    WIN("🎉 3개의 숫자를 모두 맞히셨습니다! 게임 종료 🎉"),
    COMMAND("👉 게임을 새로 시작하려면 ☝1, 종료하려면 ✌2 를 입력하세요."),
    QUIT("━━━━━━━━━━━━━━ 게임을 종료하였습니다. ━━━━━━━━━━━━━━"),
    ERROR_NUMBER("[ERROR] 숫자만 입력해 주세요."),
    ERROR_NUMBER_LENGTH("[ERROR] 3자리의 숫자만 입력 가능합니다."),
    ERROR_DUPLICATION_NUMBER("[ERROR] 중복된 숫자는 입력 불가합니다."),
    ERROR_ZERO_NUMBER("[ERROR] 숫자 0은 입력하실 수 없습니다.");
    String view;

    MESSAGE(String view) {
        this.view = view;
    }

    public String getView() {
        return view;
    }
}
