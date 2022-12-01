package lotto;

public class CommonInputValidator {

    public static void validateCommonInput(String input) {
        validateInputBlank(input);
        validateInputType(input);
    }

    private static void validateInputType(String input) {
        if (!input.matches("^[0-9]*$")) {
            throw new IllegalArgumentException(ErrorMessage.ERROR_INPUT_STRING.getErrorMessage());
        }
    }

    private static void validateInputBlank(String input) {
        String[] checkBlank = input.split("");
        for (String check : checkBlank) {
            if (check.equals(" ")) {
                throw new IllegalArgumentException(ErrorMessage.ERROR_INPUT_BLANK.getErrorMessage());
            }
        }
    }
}
