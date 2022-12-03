package lotto.view;

public enum ErrorMessage {
    ERROR_LOTTO_RANGE("[ERROR] 로또 범위를 벗어났습니다."),
    ERROR_LOTTO_DUPLICATE("[ERROR] 로또 번호에 중복된 번호가 있습니다."),
    ERROR_LOTTO_SIZE("[ERROR] 로또 번호의 개수는 6개이어야 합니다."),
    ERROR_INPUT_STRING("[ERROR] 문자를 입력할 수 없습니다."),
    ERROR_INPUT_BLANK("[ERROR] 입력한 값에 공백이 있습니다."),
    ERROR_INPUT_ZERO("[ERROR] 로또를 구입하지 않았습니다."),
    ERROR_INPUT_SEPARATOR("[ERROR] 당첨 번호는 쉼표를 기준으로 입력해주세요."),
    ERROR_INPUT_PURCHASE("[ERROR] 구입 금액은 1000단위로 입력할 수 있습니다."),
    ERROR_BONUS_LENGTH("[ERROR] 당첨 번호는 하나만 입력할 수 있습니다."),
    ERROR_BONUS_RANGE("[ERROR] 1~45범위의 번호를 입력해야 합니다."),
    ERROR_OVERLAP("[ERROR] 당첨 번호와 중복된 번호가 있습니다.");

    private final String errorMessage;

    ErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
