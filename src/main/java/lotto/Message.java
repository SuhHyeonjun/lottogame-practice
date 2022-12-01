package lotto;

public enum Message {
    INPUT_PURCHASE_PRICE("구입금액을 입력해 주세요."),
    PURCHASE_AMOUNT("개를 구매했습니다."),
    INPUT_WINNING_NUMBER("당첨 번호를 입력해 주세요."),
    INPUT_BONUS_NUMBER("보너스 번호를 입력해 주세요."),
    RESULT("당첨 통계\n---"),
    TOTAL_RATE("총 수익률은 %입니다.");

    private final String message;

    Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
