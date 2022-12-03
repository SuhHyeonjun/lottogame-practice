package lotto.validator;

import lotto.view.ErrorMessage;

public class InputBonusValidator {

    public static void validateBonusNumber(String inputBonus) {
        validateBonusRange(inputBonus);
        validateBonusLength(inputBonus);
    }

    private static void validateBonusRange(String inputBonus) {
        int[] checkRange = new int[] {Integer.parseInt(inputBonus)};
            if (checkRange[0] < 1 || checkRange[0] > 45) {
                throw new IllegalArgumentException(ErrorMessage.ERROR_BONUS_RANGE.getErrorMessage());
            }
    }

    private static void validateBonusLength(String inputBonus) {
        int[] checkRange = new int[] {Integer.parseInt(inputBonus)};
        if (checkRange.length != 1) {
            throw new IllegalArgumentException(ErrorMessage.ERROR_BONUS_LENGTH.getErrorMessage());
        }
    }
}
