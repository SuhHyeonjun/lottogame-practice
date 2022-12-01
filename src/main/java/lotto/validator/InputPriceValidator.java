package lotto.validator;

import lotto.view.ErrorMessage;

public class InputPriceValidator {
    private static final int DIVIDE = 1000;
    private static final int ZERO = 0;

    public static void validatePurchasePrice(int purchasePrice) {
        if (purchasePrice % DIVIDE != ZERO) {
            throw new IllegalArgumentException(ErrorMessage.ERROR_INPUT_PURCHASE.getErrorMessage());
        }
    }

    public static void validateZero(int purchasePrice) {
        if (purchasePrice == ZERO) {
            throw new IllegalArgumentException(ErrorMessage.ERROR_INPUT_ZERO.getErrorMessage());
        }
    }
}
