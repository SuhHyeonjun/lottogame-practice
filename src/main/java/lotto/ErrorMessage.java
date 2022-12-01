package lotto;

public enum ErrorMessage {
    ERROR_LOTTO_RANGE("[ERROR] 로또 범위를 벗어났습니다."),
    ERROR_LOTTO_DUPLICATE("[ERROR] 로또 번호에 중복된 번호가 있습니다."),
    ERROR_LOTTO_SIZE("[ERROR] 로또 번호의 개수는 6개이어야 합니다.");

    private final String errorMessage;

    ErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
