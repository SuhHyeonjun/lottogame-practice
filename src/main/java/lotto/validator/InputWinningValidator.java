package lotto.validator;

import java.util.List;
import lotto.domain.Lotto;
import lotto.view.ErrorMessage;

public class InputWinningValidator {

    public static void validateWinningNumber(List<Integer> winningNumbers) {
        Lotto.validateLottoDupulicate(winningNumbers);
        Lotto.validate(winningNumbers);
        Lotto.validateLottoRange(winningNumbers);
    }

    public static void validateInputWinningString(String inputWinning) {
        validateInputBlank(inputWinning);
        validateInputSeparator(inputWinning);
        validateInputType(inputWinning);
    }

    private static void validateInputType(String inputWinning) {
        String[] checkString = inputWinning.split(",");
        for (String check : checkString) {
            if (!check.matches("^[0-9]*$")) {
                throw new IllegalArgumentException(ErrorMessage.ERROR_INPUT_STRING.getErrorMessage());
            }
        }
    }

    private static void validateInputSeparator(String inputWinning) {
        String[] checkString = inputWinning.split(",");
        if (checkString.length != 6) {
            throw new IllegalArgumentException(ErrorMessage.ERROR_INPUT_SEPARATOR.getErrorMessage());
        }
    }

    private static void validateInputBlank(String inputWinning) {
        String[] checkBlank = inputWinning.split(",");
        for (String check : checkBlank) {
            if (check.equals(" ")) {
                throw new IllegalArgumentException(ErrorMessage.ERROR_INPUT_BLANK.getErrorMessage());
            }
        }
    }
}
